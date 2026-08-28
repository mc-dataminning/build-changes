import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehm extends elh {
   public static final MapCodec<ehm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               eop.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               btb.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               egh.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ehn.b.optionalFieldOf("debug_settings", ehn.a).forGetter($$0x -> $$0x.h),
               jt.a(mg.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ehm::new)
   );
   public final eop e;
   public final btb f;
   public final egh g;
   public final ehn h;
   public final ji<dlu> i;

   public ehm(float $$0, eop $$1, btb $$2, egh $$3, ehn $$4, ji<dlu> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
