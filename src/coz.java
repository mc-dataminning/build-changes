import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record coz(PrivateKey b, cpa c, Instant d) {
   public static final Codec<coz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axx.g.fieldOf("private_key").forGetter(coz::b),
               cpa.c.fieldOf("public_key").forGetter(coz::c),
               ayi.q.fieldOf("refreshed_after").forGetter(coz::d)
            )
            .apply($$0, coz::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
