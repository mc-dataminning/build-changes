import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cnz(PrivateKey b, coa c, Instant d) {
   public static final Codec<cnz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayd.g.fieldOf("private_key").forGetter(cnz::b),
               coa.c.fieldOf("public_key").forGetter(cnz::c),
               ayo.p.fieldOf("refreshed_after").forGetter(cnz::d)
            )
            .apply($$0, cnz::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
