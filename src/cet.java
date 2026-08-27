import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cet(PrivateKey b, ceu c, Instant d) {
   public static final Codec<cet> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asw.g.fieldOf("private_key").forGetter(cet::b),
               ceu.c.fieldOf("public_key").forGetter(cet::c),
               atg.m.fieldOf("refreshed_after").forGetter(cet::d)
            )
            .apply($$0, cet::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
