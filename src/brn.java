import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brn extends brq {
   public static final brn a = new brn(0);
   public static final MapCodec<brn> b = Codec.INT.fieldOf("value").xmap(brn::a, brn::d);
   private final int f;

   public static brn a(int $$0) {
      return $$0 == 0 ? a : new brn($$0);
   }

   private brn(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azh $$0) {
      return this.f;
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public brr<?> c() {
      return brr.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
