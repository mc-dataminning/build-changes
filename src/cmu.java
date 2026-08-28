import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cmu(PrivateKey b, cmv c, Instant d) {
   public static final Codec<cmu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axs.g.fieldOf("private_key").forGetter(cmu::b),
               cmv.c.fieldOf("public_key").forGetter(cmu::c),
               ayc.o.fieldOf("refreshed_after").forGetter(cmu::d)
            )
            .apply($$0, cmu::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
