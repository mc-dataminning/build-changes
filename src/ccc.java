import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record ccc(PrivateKey b, ccd c, Instant d) {
   public static final Codec<ccc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ara.g.fieldOf("private_key").forGetter(ccc::b),
               ccd.c.fieldOf("public_key").forGetter(ccc::c),
               arj.m.fieldOf("refreshed_after").forGetter(ccc::d)
            )
            .apply($$0, ccc::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
