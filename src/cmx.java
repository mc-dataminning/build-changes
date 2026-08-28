import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cmx(PrivateKey b, cmy c, Instant d) {
   public static final Codec<cmx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axk.g.fieldOf("private_key").forGetter(cmx::b),
               cmy.c.fieldOf("public_key").forGetter(cmx::c),
               axv.o.fieldOf("refreshed_after").forGetter(cmx::d)
            )
            .apply($$0, cmx::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
