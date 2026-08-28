import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cot(PrivateKey b, cou c, Instant d) {
   public static final Codec<cot> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.g.fieldOf("private_key").forGetter(cot::b),
               cou.c.fieldOf("public_key").forGetter(cot::c),
               ayw.q.fieldOf("refreshed_after").forGetter(cot::d)
            )
            .apply($$0, cot::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
