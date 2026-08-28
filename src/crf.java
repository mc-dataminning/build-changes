import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record crf(PrivateKey b, crg c, Instant d) {
   public static final Codec<crf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayj.g.fieldOf("private_key").forGetter(crf::b),
               crg.c.fieldOf("public_key").forGetter(crf::c),
               ayu.q.fieldOf("refreshed_after").forGetter(crf::d)
            )
            .apply($$0, crf::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
