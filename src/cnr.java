import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cnr(PrivateKey b, cns c, Instant d) {
   public static final Codec<cnr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aya.g.fieldOf("private_key").forGetter(cnr::b),
               cns.c.fieldOf("public_key").forGetter(cnr::c),
               ayl.o.fieldOf("refreshed_after").forGetter(cnr::d)
            )
            .apply($$0, cnr::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
