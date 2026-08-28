import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eif extends ema {
   public static final MapCodec<eif> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               epi.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               btg.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eha.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eig.b.optionalFieldOf("debug_settings", eig.a).forGetter($$0x -> $$0x.h),
               jt.a(mg.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eif::new)
   );
   public final epi e;
   public final btg f;
   public final eha g;
   public final eig h;
   public final ji<dmf> i;

   public eif(float $$0, epi $$1, btg $$2, eha $$3, eig $$4, ji<dmf> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
