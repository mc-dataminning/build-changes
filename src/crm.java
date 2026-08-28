import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record crm(PrivateKey b, crn c, Instant d) {
   public static final Codec<crm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayj.g.fieldOf("private_key").forGetter(crm::b),
               crn.c.fieldOf("public_key").forGetter(crm::c),
               ayu.q.fieldOf("refreshed_after").forGetter(crm::d)
            )
            .apply($$0, crm::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
