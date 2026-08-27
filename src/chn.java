import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record chn(PrivateKey b, cho c, Instant d) {
   public static final Codec<chn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avg.g.fieldOf("private_key").forGetter(chn::b),
               cho.c.fieldOf("public_key").forGetter(chn::c),
               avq.m.fieldOf("refreshed_after").forGetter(chn::d)
            )
            .apply($$0, chn::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
