import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record byq(PrivateKey b, byr c, Instant d) {
   public static final Codec<byq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               anz.g.fieldOf("private_key").forGetter(byq::b),
               byr.c.fieldOf("public_key").forGetter(byq::c),
               aoi.m.fieldOf("refreshed_after").forGetter(byq::d)
            )
            .apply($$0, byq::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
