import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egk extends ekf {
   public static final MapCodec<egk> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               enn.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bst.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eff.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               egl.b.optionalFieldOf("debug_settings", egl.a).forGetter($$0x -> $$0x.h),
               kh.a(me.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, egk::new)
   );
   public final enn e;
   public final bst f;
   public final eff g;
   public final egl h;
   public final jw<dku> i;

   public egk(float $$0, enn $$1, bst $$2, eff $$3, egl $$4, jw<dku> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
