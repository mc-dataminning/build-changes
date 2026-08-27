import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cjv(PrivateKey b, cjw c, Instant d) {
   public static final Codec<cjv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awi.g.fieldOf("private_key").forGetter(cjv::b),
               cjw.c.fieldOf("public_key").forGetter(cjv::c),
               aws.m.fieldOf("refreshed_after").forGetter(cjv::d)
            )
            .apply($$0, cjv::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
