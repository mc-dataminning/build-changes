import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cdo(PrivateKey b, cdp c, Instant d) {
   public static final Codec<cdo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ash.g.fieldOf("private_key").forGetter(cdo::b),
               cdp.c.fieldOf("public_key").forGetter(cdo::c),
               asq.m.fieldOf("refreshed_after").forGetter(cdo::d)
            )
            .apply($$0, cdo::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
