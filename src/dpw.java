import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpw implements dpu {
   public static final Codec<dpw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drv.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               drv.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dpw::new)
   );
   public final drv b;
   public final drv c;
   public final int d;

   public dpw(drv $$0, drv $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
