import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record coy(PrivateKey b, coz c, Instant d) {
   public static final Codec<coy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axx.g.fieldOf("private_key").forGetter(coy::b),
               coz.c.fieldOf("public_key").forGetter(coy::c),
               ayi.q.fieldOf("refreshed_after").forGetter(coy::d)
            )
            .apply($$0, coy::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
