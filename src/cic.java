import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cic(PrivateKey b, cid c, Instant d) {
   public static final Codec<cic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avk.g.fieldOf("private_key").forGetter(cic::b),
               cid.c.fieldOf("public_key").forGetter(cic::c),
               avu.n.fieldOf("refreshed_after").forGetter(cic::d)
            )
            .apply($$0, cic::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
