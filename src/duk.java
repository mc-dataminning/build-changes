import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duk extends dye {
   public static final MapCodec<duk> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ebj.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bmf.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dtg.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dul.b.optionalFieldOf("debug_settings", dul.a).forGetter($$0x -> $$0x.h),
               ja.a(kj.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, duk::new)
   );
   public final ebj e;
   public final bmf f;
   public final dtg g;
   public final dul h;
   public final ip<daa> i;

   public duk(float $$0, ebj $$1, bmf $$2, dtg $$3, dul $$4, ip<daa> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
