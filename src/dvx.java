import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvx extends dwg {
   public static final Codec<dvx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("noise_to_count_ratio").forGetter($$0x -> $$0x.c),
               Codec.DOUBLE.fieldOf("noise_factor").forGetter($$0x -> $$0x.d),
               Codec.DOUBLE.fieldOf("noise_offset").orElse(0.0).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dvx::new)
   );
   private final int c;
   private final double d;
   private final double e;

   private dvx(int $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static dvx a(int $$0, double $$1, double $$2) {
      return new dvx($$0, $$1, $$2);
   }

   @Override
   protected int a(ato $$0, ht $$1) {
      double $$2 = csq.e.a((double)$$1.u() / this.d, (double)$$1.w() / this.d, false);
      return (int)Math.ceil(($$2 + this.e) * (double)this.c);
   }

   @Override
   public dwd<?> b() {
      return dwd.g;
   }
}
