import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpx extends bpz {
   public static final bpx a = new bpx(0.0F);
   public static final MapCodec<bpx> b = Codec.FLOAT.fieldOf("value").xmap(bpx::a, bpx::d);
   private final float d;

   public static bpx a(float $$0) {
      return $$0 == 0.0F ? a : new bpx($$0);
   }

   private bpx(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azh $$0) {
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
   public bqa<?> c() {
      return bqa.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
