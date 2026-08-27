import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvd extends dvl {
   public static final Codec<dvd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.DOUBLE.fieldOf("noise_level").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("below_noise").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("above_noise").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dvd::new)
   );
   private final double c;
   private final int d;
   private final int e;

   private dvd(double $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static dvd a(double $$0, int $$1, int $$2) {
      return new dvd($$0, $$1, $$2);
   }

   @Override
   protected int a(ate $$0, ht $$1) {
      double $$2 = crx.e.a((double)$$1.u() / 200.0, (double)$$1.w() / 200.0, false);
      return $$2 < this.c ? this.d : this.e;
   }

   @Override
   public dvi<?> b() {
      return dvi.h;
   }
}
