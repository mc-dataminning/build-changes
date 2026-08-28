import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cnw(PrivateKey b, cnx c, Instant d) {
   public static final Codec<cnw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayb.g.fieldOf("private_key").forGetter(cnw::b),
               cnx.c.fieldOf("public_key").forGetter(cnw::c),
               aym.p.fieldOf("refreshed_after").forGetter(cnw::d)
            )
            .apply($$0, cnw::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
