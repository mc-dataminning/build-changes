import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record ciu(PrivateKey b, civ c, Instant d) {
   public static final Codec<ciu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.g.fieldOf("private_key").forGetter(ciu::b),
               civ.c.fieldOf("public_key").forGetter(ciu::c),
               awe.n.fieldOf("refreshed_after").forGetter(ciu::d)
            )
            .apply($$0, ciu::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
