import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cpq(PrivateKey b, cpr c, Instant d) {
   public static final Codec<cpq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.g.fieldOf("private_key").forGetter(cpq::b),
               cpr.c.fieldOf("public_key").forGetter(cpq::c),
               azd.q.fieldOf("refreshed_after").forGetter(cpq::d)
            )
            .apply($$0, cpq::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
