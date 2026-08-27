import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiv extends eje {
   public static final Codec<eiv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("noise_to_count_ratio").forGetter($$0x -> $$0x.c),
               Codec.DOUBLE.fieldOf("noise_factor").forGetter($$0x -> $$0x.d),
               Codec.DOUBLE.fieldOf("noise_offset").orElse(0.0).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eiv::new)
   );
   private final int c;
   private final double d;
   private final double e;

   private eiv(int $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static eiv a(int $$0, double $$1, double $$2) {
      return new eiv($$0, $$1, $$2);
   }

   @Override
   protected int a(ayt $$0, ir $$1) {
      double $$2 = dcz.e.a((double)$$1.u() / this.d, (double)$$1.w() / this.d, false);
      return (int)Math.ceil(($$2 + this.e) * (double)this.c);
   }

   @Override
   public ejb<?> b() {
      return ejb.g;
   }
}
