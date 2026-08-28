import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record csl(PrivateKey b, csm c, Instant d) {
   public static final Codec<csl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.g.fieldOf("private_key").forGetter(csl::b),
               csm.c.fieldOf("public_key").forGetter(csl::c),
               azg.q.fieldOf("refreshed_after").forGetter(csl::d)
            )
            .apply($$0, csl::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
