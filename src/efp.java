import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efp extends ejk {
   public static final MapCodec<efp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               emr.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bsm.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eek.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               efq.b.optionalFieldOf("debug_settings", efq.a).forGetter($$0x -> $$0x.h),
               kf.a(mb.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, efp::new)
   );
   public final emr e;
   public final bsm f;
   public final eek g;
   public final efq h;
   public final ju<dkm> i;

   public efp(float $$0, emr $$1, bsm $$2, eek $$3, efq $$4, ju<dkm> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
