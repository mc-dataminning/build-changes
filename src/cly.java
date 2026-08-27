import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cly(PrivateKey b, clz c, Instant d) {
   public static final Codec<cly> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axc.g.fieldOf("private_key").forGetter(cly::b),
               clz.c.fieldOf("public_key").forGetter(cly::c),
               axm.m.fieldOf("refreshed_after").forGetter(cly::d)
            )
            .apply($$0, cly::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
