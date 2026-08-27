import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record ccz(PrivateKey b, cda c, Instant d) {
   public static final Codec<ccz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arx.g.fieldOf("private_key").forGetter(ccz::b),
               cda.c.fieldOf("public_key").forGetter(ccz::c),
               asg.m.fieldOf("refreshed_after").forGetter(ccz::d)
            )
            .apply($$0, ccz::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
