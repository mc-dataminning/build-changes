import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record coj(PrivateKey b, cok c, Instant d) {
   public static final Codec<coj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.g.fieldOf("private_key").forGetter(coj::b),
               cok.c.fieldOf("public_key").forGetter(coj::c),
               ays.q.fieldOf("refreshed_after").forGetter(coj::d)
            )
            .apply($$0, coj::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
