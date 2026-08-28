import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cox(PrivateKey b, coy c, Instant d) {
   public static final Codec<cox> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.g.fieldOf("private_key").forGetter(cox::b),
               coy.c.fieldOf("public_key").forGetter(cox::c),
               ayh.q.fieldOf("refreshed_after").forGetter(cox::d)
            )
            .apply($$0, cox::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
