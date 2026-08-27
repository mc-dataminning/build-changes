import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dou extends dso {
   public static final MapCodec<dou> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dvt.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bie.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dnq.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dov.b.optionalFieldOf("debug_settings", dov.a).forGetter($$0x -> $$0x.h),
               iu.a(kd.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dou::new)
   );
   public final dvt e;
   public final bie f;
   public final dnq g;
   public final dov h;
   public final ik<cvf> i;

   public dou(float $$0, dvt $$1, bie $$2, dnq $$3, dov $$4, ik<cvf> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
