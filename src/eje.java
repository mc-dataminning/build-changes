import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eje extends enb {
   public static final MapCodec<eje> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               eqk.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               btw.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ehz.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ejf.b.optionalFieldOf("debug_settings", ejf.a).forGetter($$0x -> $$0x.h),
               jv.a(mi.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eje::new)
   );
   public final eqk e;
   public final btw f;
   public final ehz g;
   public final ejf h;
   public final jk<dne> i;

   public eje(float $$0, eqk $$1, btw $$2, ehz $$3, ejf $$4, jk<dne> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
