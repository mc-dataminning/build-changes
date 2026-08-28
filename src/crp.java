import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record crp(PrivateKey b, crq c, Instant d) {
   public static final Codec<crp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayj.g.fieldOf("private_key").forGetter(crp::b),
               crq.c.fieldOf("public_key").forGetter(crp::c),
               ayu.q.fieldOf("refreshed_after").forGetter(crp::d)
            )
            .apply($$0, crp::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
