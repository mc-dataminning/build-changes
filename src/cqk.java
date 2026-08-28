import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cqk(PrivateKey b, cql c, Instant d) {
   public static final Codec<cqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.g.fieldOf("private_key").forGetter(cqk::b),
               cql.c.fieldOf("public_key").forGetter(cqk::c),
               ays.q.fieldOf("refreshed_after").forGetter(cqk::d)
            )
            .apply($$0, cqk::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
