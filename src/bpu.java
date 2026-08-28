import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpu extends bpw {
   public static final bpu a = new bpu(0.0F);
   public static final MapCodec<bpu> b = Codec.FLOAT.fieldOf("value").xmap(bpu::a, bpu::d);
   private final float d;

   public static bpu a(float $$0) {
      return $$0 == 0.0F ? a : new bpu($$0);
   }

   private bpu(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azg $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d + 1.0F;
   }

   @Override
   public bpx<?> c() {
      return bpx.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
