import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cpa(PrivateKey b, cpb c, Instant d) {
   public static final Codec<cpa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axx.g.fieldOf("private_key").forGetter(cpa::b),
               cpb.c.fieldOf("public_key").forGetter(cpa::c),
               ayi.q.fieldOf("refreshed_after").forGetter(cpa::d)
            )
            .apply($$0, cpa::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
