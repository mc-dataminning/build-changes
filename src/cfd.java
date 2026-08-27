import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cfd(PrivateKey b, cfe c, Instant d) {
   public static final Codec<cfd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.g.fieldOf("private_key").forGetter(cfd::b),
               cfe.c.fieldOf("public_key").forGetter(cfd::c),
               atq.m.fieldOf("refreshed_after").forGetter(cfd::d)
            )
            .apply($$0, cfd::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
