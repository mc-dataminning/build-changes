import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dum extends dyg {
   public static final MapCodec<dum> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ebl.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bmg.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dti.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dun.b.optionalFieldOf("debug_settings", dun.a).forGetter($$0x -> $$0x.h),
               ja.a(kj.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dum::new)
   );
   public final ebl e;
   public final bmg f;
   public final dti g;
   public final dun h;
   public final ip<dac> i;

   public dum(float $$0, ebl $$1, bmg $$2, dti $$3, dun $$4, ip<dac> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
