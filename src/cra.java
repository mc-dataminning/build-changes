import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cra(PrivateKey b, crb c, Instant d) {
   public static final Codec<cra> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayj.g.fieldOf("private_key").forGetter(cra::b),
               crb.c.fieldOf("public_key").forGetter(cra::c),
               ayu.q.fieldOf("refreshed_after").forGetter(cra::d)
            )
            .apply($$0, cra::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
