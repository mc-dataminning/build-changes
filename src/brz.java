import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brz extends bsb {
   public static final brz a = new brz(0.0F);
   public static final MapCodec<brz> b = Codec.FLOAT.fieldOf("value").xmap(brz::a, brz::d);
   private final float d;

   public static brz a(float $$0) {
      return $$0 == 0.0F ? a : new brz($$0);
   }

   private brz(float $$0) {
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
   public bsc<?> c() {
      return bsc.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
