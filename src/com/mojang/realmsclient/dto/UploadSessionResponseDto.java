package com.mojang.realmsclient.dto;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public record UploadSessionResponseDto(@SerializedName("result") UploadSessionResponseDto.@Nullable Result result) implements ReflectionBasedSerialization {
   public record Result(
      @SerializedName("token") @Nullable String token,
      @SerializedName("uploadUrl") @Nullable String uploadUrl,
      @SerializedName("statusUrl") @Nullable String statusUrl,
      @SerializedName("completeUrl") @Nullable String completeUrl,
      @SerializedName("cancelUrl") @Nullable String cancelUrl,
      @SerializedName("renewUrl") @Nullable String renewUrl,
      @SerializedName("expiresAtUtc") @Nullable String expiresAtUtc,
      @SerializedName("supportsBlockUpload") @Nullable Boolean supportsBlockUpload,
      @SerializedName("maxSinglePutSizeBytes") @Nullable BigDecimal maxSinglePutSizeBytes,
      @SerializedName("recommendedBlockSizeBytes") @Nullable BigDecimal recommendedBlockSizeBytes,
      @SerializedName("maxBlockCount") @Nullable BigDecimal maxBlockCount,
      @SerializedName("maxUploadSizeBytes") @Nullable BigDecimal maxUploadSizeBytes,
      @SerializedName("acceptedArchiveFormats") @Nullable Set<String> acceptedArchiveFormats
   ) implements ReflectionBasedSerialization {
   }
}
