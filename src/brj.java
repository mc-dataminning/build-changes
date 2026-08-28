import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brj extends brl {
   public static final brj a = new brj(0.0F);
   public static final MapCodec<brj> b = Codec.FLOAT.fieldOf("value").xmap(brj::a, brj::d);
   private final float d;

   public static brj a(float $$0) {
      return $$0 == 0.0F ? a : new brj($$0);
   }

   private brj(float $$0) {
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
      return this.d;
   }

   @Override
   public brm<?> c() {
      return brm.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
