import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record ceb(PrivateKey b, cec c, Instant d) {
   public static final Codec<ceb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asp.g.fieldOf("private_key").forGetter(ceb::b),
               cec.c.fieldOf("public_key").forGetter(ceb::c),
               asy.m.fieldOf("refreshed_after").forGetter(ceb::d)
            )
            .apply($$0, ceb::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
