import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brm extends brp {
   public static final brm a = new brm(0);
   public static final MapCodec<brm> b = Codec.INT.fieldOf("value").xmap(brm::a, brm::d);
   private final int f;

   public static brm a(int $$0) {
      return $$0 == 0 ? a : new brm($$0);
   }

   private brm(int $$0) {
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
   public brq<?> c() {
      return brq.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
