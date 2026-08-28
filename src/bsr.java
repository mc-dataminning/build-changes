import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsr extends bst {
   public static final bsr a = new bsr(0.0F);
   public static final MapCodec<bsr> b = Codec.FLOAT.fieldOf("value").xmap(bsr::a, bsr::d);
   private final float d;

   public static bsr a(float $$0) {
      return $$0 == 0.0F ? a : new bsr($$0);
   }

   private bsr(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azs $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d;
   }

   @Override
   public bsu<?> c() {
      return bsu.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
