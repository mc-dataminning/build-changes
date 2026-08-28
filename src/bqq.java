import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bqq extends bqs {
   public static final bqq a = new bqq(0.0F);
   public static final MapCodec<bqq> b = Codec.FLOAT.fieldOf("value").xmap(bqq::a, bqq::d);
   private final float d;

   public static bqq a(float $$0) {
      return $$0 == 0.0F ? a : new bqq($$0);
   }

   private bqq(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azl $$0) {
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
   public bqt<?> c() {
      return bqt.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
