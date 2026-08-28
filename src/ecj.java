import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecj extends ege {
   public static final MapCodec<ecj> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ejj.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bqs.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ebe.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eck.b.optionalFieldOf("debug_settings", eck.a).forGetter($$0x -> $$0x.h),
               kc.a(lv.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ecj::new)
   );
   public final ejj e;
   public final bqs f;
   public final ebe g;
   public final eck h;
   public final jr<dhj> i;

   public ecj(float $$0, ejj $$1, bqs $$2, ebe $$3, eck $$4, jr<dhj> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
