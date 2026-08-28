import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record csa(PrivateKey b, csb c, Instant d) {
   public static final Codec<csa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.g.fieldOf("private_key").forGetter(csa::b),
               csb.c.fieldOf("public_key").forGetter(csa::c),
               ayw.q.fieldOf("refreshed_after").forGetter(csa::d)
            )
            .apply($$0, csa::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
