import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record ckn(PrivateKey b, cko c, Instant d) {
   public static final Codec<ckn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.g.fieldOf("private_key").forGetter(ckn::b),
               cko.c.fieldOf("public_key").forGetter(ckn::c),
               axe.m.fieldOf("refreshed_after").forGetter(ckn::d)
            )
            .apply($$0, ckn::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
