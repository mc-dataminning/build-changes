import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brm extends bro {
   public static final brm a = new brm(0.0F);
   public static final MapCodec<brm> b = Codec.FLOAT.fieldOf("value").xmap(brm::a, brm::d);
   private final float d;

   public static brm a(float $$0) {
      return $$0 == 0.0F ? a : new brm($$0);
   }

   private brm(float $$0) {
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
   public brp<?> c() {
      return brp.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
