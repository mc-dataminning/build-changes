package com.mojang.realmsclient.dto;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record DownloadSessionResponseDto(@SerializedName("result") DownloadSessionResponseDto.@Nullable Result result) implements ReflectionBasedSerialization {
   public record Result(@SerializedName("downloadUrl") @Nullable String downloadUrl, @SerializedName("status") @Nullable String status)
      implements ReflectionBasedSerialization {
   }
}
