import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brk extends brm {
   public static final brk a = new brk(0.0F);
   public static final MapCodec<brk> b = Codec.FLOAT.fieldOf("value").xmap(brk::a, brk::d);
   private final float d;

   public static brk a(float $$0) {
      return $$0 == 0.0F ? a : new brk($$0);
   }

   private brk(float $$0) {
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
      return this.d;
   }

   @Override
   public brn<?> c() {
      return brn.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
