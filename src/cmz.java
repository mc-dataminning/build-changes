import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cmz(PrivateKey b, cna c, Instant d) {
   public static final Codec<cmz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axl.g.fieldOf("private_key").forGetter(cmz::b),
               cna.c.fieldOf("public_key").forGetter(cmz::c),
               axw.o.fieldOf("refreshed_after").forGetter(cmz::d)
            )
            .apply($$0, cmz::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
