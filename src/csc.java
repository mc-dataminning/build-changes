import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record csc(PrivateKey b, csd c, Instant d) {
   public static final Codec<csc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayn.g.fieldOf("private_key").forGetter(csc::b),
               csd.c.fieldOf("public_key").forGetter(csc::c),
               ayy.q.fieldOf("refreshed_after").forGetter(csc::d)
            )
            .apply($$0, csc::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
