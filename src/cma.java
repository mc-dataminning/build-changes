import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cma(PrivateKey b, cmb c, Instant d) {
   public static final Codec<cma> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axd.g.fieldOf("private_key").forGetter(cma::b),
               cmb.c.fieldOf("public_key").forGetter(cma::c),
               axn.m.fieldOf("refreshed_after").forGetter(cma::d)
            )
            .apply($$0, cma::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
