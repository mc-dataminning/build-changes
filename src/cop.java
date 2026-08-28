import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cop(PrivateKey b, coq c, Instant d) {
   public static final Codec<cop> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.g.fieldOf("private_key").forGetter(cop::b),
               coq.c.fieldOf("public_key").forGetter(cop::c),
               ayt.q.fieldOf("refreshed_after").forGetter(cop::d)
            )
            .apply($$0, cop::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
