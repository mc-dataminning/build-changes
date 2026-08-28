import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class brq extends brk {
   public static final MapCodec<brq> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.FLOAT.fieldOf("min").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("max").forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("plateau").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, brq::new)
      )
      .validate(
         $$0 -> {
            if ($$0.d < $$0.b) {
               return DataResult.error(() -> "Max must be larger than min: [" + $$0.b + ", " + $$0.d + "]");
            } else {
               return $$0.e > $$0.d - $$0.b
                  ? DataResult.error(() -> "Plateau can at most be the full span: [" + $$0.b + ", " + $$0.d + "]")
                  : DataResult.success($$0);
            }
         }
      );
   private final float b;
   private final float d;
   private final float e;

   public static brq a(float $$0, float $$1, float $$2) {
      return new brq($$0, $$1, $$2);
   }

   private brq(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public float a(azv $$0) {
      float $$1 = this.d - this.b;
      float $$2 = ($$1 - this.e) / 2.0F;
      float $$3 = $$1 - $$2;
      return this.b + $$0.i() * $$3 + $$0.i() * $$2;
   }

   @Override
   public float a() {
      return this.b;
   }

   @Override
   public float b() {
      return this.d;
   }

   @Override
   public brl<?> c() {
      return brl.d;
   }

   @Override
   public String toString() {
      return "trapezoid(" + this.e + ") in [" + this.b + "-" + this.d + "]";
   }
}
