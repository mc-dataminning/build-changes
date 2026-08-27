import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvy implements dvw {
   public static final Codec<dvy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxx.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dxx.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dvy::new)
   );
   public final dxx b;
   public final dxx c;
   public final int d;

   public dvy(dxx $$0, dxx $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
