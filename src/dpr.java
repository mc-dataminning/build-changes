import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpr implements dpp {
   public static final Codec<dpr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drq.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               drq.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dpr::new)
   );
   public final drq b;
   public final drq c;
   public final int d;

   public dpr(drq $$0, drq $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
