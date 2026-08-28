import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehz extends eii {
   public static final MapCodec<ehz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("noise_to_count_ratio").forGetter($$0x -> $$0x.c),
               Codec.DOUBLE.fieldOf("noise_factor").forGetter($$0x -> $$0x.d),
               Codec.DOUBLE.fieldOf("noise_offset").orElse(0.0).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehz::new)
   );
   private final int c;
   private final double d;
   private final double e;

   private ehz(int $$0, double $$1, double $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static ehz a(int $$0, double $$1, double $$2) {
      return new ehz($$0, $$1, $$2);
   }

   @Override
   protected int a(ayo $$0, ja $$1) {
      double $$2 = ddg.e.a((double)$$1.u() / this.d, (double)$$1.w() / this.d, false);
      return (int)Math.ceil(($$2 + this.e) * (double)this.c);
   }

   @Override
   public eif<?> b() {
      return eif.g;
   }
}
