import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsj extends bsl {
   public static final bsj a = new bsj(0.0F);
   public static final MapCodec<bsj> b = Codec.FLOAT.fieldOf("value").xmap(bsj::a, bsj::d);
   private final float d;

   public static bsj a(float $$0) {
      return $$0 == 0.0F ? a : new bsj($$0);
   }

   private bsj(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(bam $$0) {
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
   public bsm<?> c() {
      return bsm.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
