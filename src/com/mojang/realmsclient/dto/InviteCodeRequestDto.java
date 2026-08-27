package com.mojang.realmsclient.dto;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record InviteCodeRequestDto(
   @Nullable @SerializedName("linkId") String code,
   @SerializedName("realmId") long realmId,
   @SerializedName("enabled") boolean enabled,
   @Nullable @SerializedName("expirationDate") Long expirationDate
) implements ReflectionBasedSerialization {
}
