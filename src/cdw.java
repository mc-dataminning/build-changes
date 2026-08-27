import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cdw(PrivateKey b, cdx c, Instant d) {
   public static final Codec<cdw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asl.g.fieldOf("private_key").forGetter(cdw::b),
               cdx.c.fieldOf("public_key").forGetter(cdw::c),
               asu.m.fieldOf("refreshed_after").forGetter(cdw::d)
            )
            .apply($$0, cdw::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
