import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record ckc(PrivateKey b, ckd c, Instant d) {
   public static final Codec<ckc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awk.g.fieldOf("private_key").forGetter(ckc::b),
               ckd.c.fieldOf("public_key").forGetter(ckc::c),
               awu.m.fieldOf("refreshed_after").forGetter(ckc::d)
            )
            .apply($$0, ckc::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
