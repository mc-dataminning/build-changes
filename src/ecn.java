import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecn extends egi {
   public static final MapCodec<ecn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ejn.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bqv.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ebi.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eco.b.optionalFieldOf("debug_settings", eco.a).forGetter($$0x -> $$0x.h),
               kd.a(lw.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ecn::new)
   );
   public final ejn e;
   public final bqv f;
   public final ebi g;
   public final eco h;
   public final js<dhm> i;

   public ecn(float $$0, ejn $$1, bqv $$2, ebi $$3, eco $$4, js<dhm> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
