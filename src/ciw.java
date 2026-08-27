import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record ciw(PrivateKey b, cix c, Instant d) {
   public static final Codec<ciw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.g.fieldOf("private_key").forGetter(ciw::b),
               cix.c.fieldOf("public_key").forGetter(ciw::c),
               awe.n.fieldOf("refreshed_after").forGetter(ciw::d)
            )
            .apply($$0, ciw::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
