import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cby(PrivateKey b, cbz c, Instant d) {
   public static final Codec<cby> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.g.fieldOf("private_key").forGetter(cby::b),
               cbz.c.fieldOf("public_key").forGetter(cby::c),
               arh.m.fieldOf("refreshed_after").forGetter(cby::d)
            )
            .apply($$0, cby::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
