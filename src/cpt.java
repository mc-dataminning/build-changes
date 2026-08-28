import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cpt(PrivateKey b, cpu c, Instant d) {
   public static final Codec<cpt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axx.g.fieldOf("private_key").forGetter(cpt::b),
               cpu.c.fieldOf("public_key").forGetter(cpt::c),
               ayi.q.fieldOf("refreshed_after").forGetter(cpt::d)
            )
            .apply($$0, cpt::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
