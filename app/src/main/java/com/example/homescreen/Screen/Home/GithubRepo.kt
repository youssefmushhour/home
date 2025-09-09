package com.example.homescreen.Screen.Home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.homescreen.Screen.ReboCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun reboScreen(modifier: Modifier = Modifier) {
    val data: MutableList<Data> = mutableListOf(
        Data(
            com.example.homescreen.R.drawable.r1,
            "XML",
            "Traditional UI Design",
            "The classic way of creating Android layouts using XML files to define views and structures.",
            250
        ),
        Data(
            com.example.homescreen.R.drawable.r2,
            "IntelIJ",
            "Powerful kotlin IDE",
            "A professional IDE by JetBrains, widely used for Java, Kotlin, and many other languages, with advanced coding and debugging features.",
            300
        ),
        Data(
            com.example.homescreen.R.drawable.r3,
            "kotlin",
            "Android Programming Language",
            "A modern programming language officially supported by Google, making Android development faster and safer.",
            280
        ),
        Data(
            com.example.homescreen.R.drawable.r4,
            "Android Studio",
            " Official Android IDE",
            "The official development environment for building Android apps with powerful coding, design, and testing tools.",
            400
        ),
        Data(
            com.example.homescreen.R.drawable.r5,
            "Figma",
            " UI/UX Design Tool",
            "A collaborative design tool for creating UI and UX, working seamlessly online with teams",
            350
        ),
        Data(
            com.example.homescreen.R.drawable.r6,
            "git",
            " Code Hosting Platform",
            "A platform for version control and collaboration, letting developers host and manage their code with Git.",
            320
        ),

        Data(
            com.example.homescreen.R.drawable.github,
            "James",
            "Anderson",
            "Optimized for low-end devices while still providing a premium feel, balancing performance and design across all Android ecosystems.",
            310
        ),
        Data(
            com.example.homescreen.R.drawable.starr,
            "Isabella",
            "Martinez",
            "Demonstrates strong security practices including encrypted storage, secure authentication, and protection against common mobile threats.",
            330
        ),
        Data(
            com.example.homescreen.R.drawable.gooogle,
            "Ethan",
            "Williams",
            "Focused on future-ready architecture, using clean code principles, MVVM, and modularization for easier testing and maintenance.",
            390
        )
    )
    Scaffold(
        Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "GitHub Rebo", Modifier.fillMaxWidth(), textAlign = TextAlign.Center
                    )
                })
        }) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            LazyColumn {
                items(data){ card ->
                    ReboCard(card)

                }
            }

        }

    }

}

@Preview
@Composable
private fun previewReboScreeen() {
    reboScreen()

}