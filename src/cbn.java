import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cbn(PrivateKey b, cbo c, Instant d) {
   public static final Codec<cbn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqn.g.fieldOf("private_key").forGetter(cbn::b),
               cbo.c.fieldOf("public_key").forGetter(cbn::c),
               aqw.m.fieldOf("refreshed_after").forGetter(cbn::d)
            )
            .apply($$0, cbn::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
