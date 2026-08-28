import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cqu(PrivateKey b, cqv c, Instant d) {
   public static final Codec<cqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.g.fieldOf("private_key").forGetter(cqu::b),
               cqv.c.fieldOf("public_key").forGetter(cqu::c),
               ays.q.fieldOf("refreshed_after").forGetter(cqu::d)
            )
            .apply($$0, cqu::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
