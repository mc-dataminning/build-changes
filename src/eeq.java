import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeq extends eil {
   public static final MapCodec<eeq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               els.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               brm.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               edl.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eer.b.optionalFieldOf("debug_settings", eer.a).forGetter($$0x -> $$0x.h),
               kg.a(mc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eeq::new)
   );
   public final els e;
   public final brm f;
   public final edl g;
   public final eer h;
   public final jv<djl> i;

   public eeq(float $$0, els $$1, brm $$2, edl $$3, eer $$4, jv<djl> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
