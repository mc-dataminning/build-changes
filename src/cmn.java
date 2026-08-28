import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cmn(PrivateKey b, cmo c, Instant d) {
   public static final Codec<cmn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axd.g.fieldOf("private_key").forGetter(cmn::b),
               cmo.c.fieldOf("public_key").forGetter(cmn::c),
               axo.o.fieldOf("refreshed_after").forGetter(cmn::d)
            )
            .apply($$0, cmn::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
