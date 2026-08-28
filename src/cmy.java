import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cmy(PrivateKey b, cmz c, Instant d) {
   public static final Codec<cmy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axv.g.fieldOf("private_key").forGetter(cmy::b),
               cmz.c.fieldOf("public_key").forGetter(cmy::c),
               ayg.o.fieldOf("refreshed_after").forGetter(cmy::d)
            )
            .apply($$0, cmy::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
