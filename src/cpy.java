import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cpy(PrivateKey b, cpz c, Instant d) {
   public static final Codec<cpy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azc.g.fieldOf("private_key").forGetter(cpy::b),
               cpz.c.fieldOf("public_key").forGetter(cpy::c),
               azn.q.fieldOf("refreshed_after").forGetter(cpy::d)
            )
            .apply($$0, cpy::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
