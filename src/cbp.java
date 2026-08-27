import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cbp(PrivateKey b, cbq c, Instant d) {
   public static final Codec<cbp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqp.g.fieldOf("private_key").forGetter(cbp::b),
               cbq.c.fieldOf("public_key").forGetter(cbp::c),
               aqy.m.fieldOf("refreshed_after").forGetter(cbp::d)
            )
            .apply($$0, cbp::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
