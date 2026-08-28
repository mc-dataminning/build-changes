import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efn extends eji {
   public static final MapCodec<efn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               emq.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bsb.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eei.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               efo.b.optionalFieldOf("debug_settings", efo.a).forGetter($$0x -> $$0x.h),
               kg.a(mc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, efn::new)
   );
   public final emq e;
   public final bsb f;
   public final eei g;
   public final efo h;
   public final jv<dke> i;

   public efn(float $$0, emq $$1, bsb $$2, eei $$3, efo $$4, jv<dke> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
