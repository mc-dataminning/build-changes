import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehi extends ehq {
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.DOUBLE.fieldOf("noise_level").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("below_noise").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("above_noise").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehi::new)
   );
   private final double c;
   private final int d;
   private final int e;

   private ehi(double $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static ehi a(double $$0, int $$1, int $$2) {
      return new ehi($$0, $$1, $$2);
   }

   @Override
   protected int a(azc $$0, iz $$1) {
      double $$2 = dcs.e.a((double)$$1.u() / 200.0, (double)$$1.w() / 200.0, false);
      return $$2 < this.c ? this.d : this.e;
   }

   @Override
   public ehn<?> b() {
      return ehn.h;
   }
}
