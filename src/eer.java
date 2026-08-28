import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eer extends eim {
   public static final MapCodec<eer> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               elt.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               brn.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               edm.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ees.b.optionalFieldOf("debug_settings", ees.a).forGetter($$0x -> $$0x.h),
               kg.a(mc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eer::new)
   );
   public final elt e;
   public final brn f;
   public final edm g;
   public final ees h;
   public final jv<djm> i;

   public eer(float $$0, elt $$1, brn $$2, edm $$3, ees $$4, jv<djm> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
