package com.mojang.realmsclient.dto;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record UploadProcessingStatusResponseDto(@SerializedName("result") UploadProcessingStatusResponseDto.@Nullable Result result)
   implements ReflectionBasedSerialization {
   public record Result(@SerializedName("status") @Nullable String status) implements ReflectionBasedSerialization {
   }
}
