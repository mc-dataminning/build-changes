import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cbr(PrivateKey b, cbs c, Instant d) {
   public static final Codec<cbr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqs.g.fieldOf("private_key").forGetter(cbr::b),
               cbs.c.fieldOf("public_key").forGetter(cbr::c),
               arb.m.fieldOf("refreshed_after").forGetter(cbr::d)
            )
            .apply($$0, cbr::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
