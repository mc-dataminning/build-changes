import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cbo(PrivateKey b, cbp c, Instant d) {
   public static final Codec<cbo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqp.g.fieldOf("private_key").forGetter(cbo::b),
               cbp.c.fieldOf("public_key").forGetter(cbo::c),
               aqy.m.fieldOf("refreshed_after").forGetter(cbo::d)
            )
            .apply($$0, cbo::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
