import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dml extends dqf {
   public static final MapCodec<dml> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dtk.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bfw.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dlh.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dmm.b.optionalFieldOf("debug_settings", dmm.a).forGetter($$0x -> $$0x.h),
               hv.a(je.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dml::new)
   );
   public final dtk e;
   public final bfw f;
   public final dlh g;
   public final dmm h;
   public final hk<csq> i;

   public dml(float $$0, dtk $$1, bfw $$2, dlh $$3, dmm $$4, hk<csq> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
