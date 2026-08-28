import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cmm(PrivateKey b, cmn c, Instant d) {
   public static final Codec<cmm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axd.g.fieldOf("private_key").forGetter(cmm::b),
               cmn.c.fieldOf("public_key").forGetter(cmm::c),
               axo.o.fieldOf("refreshed_after").forGetter(cmm::d)
            )
            .apply($$0, cmm::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
