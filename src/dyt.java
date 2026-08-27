import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyt extends ecn {
   public static final MapCodec<dyt> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               efs.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               boz.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dxp.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dyu.b.optionalFieldOf("debug_settings", dyu.a).forGetter($$0x -> $$0x.h),
               jm.a(lf.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dyt::new)
   );
   public final efs e;
   public final boz f;
   public final dxp g;
   public final dyu h;
   public final jb<dea> i;

   public dyt(float $$0, efs $$1, boz $$2, dxp $$3, dyu $$4, jb<dea> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
