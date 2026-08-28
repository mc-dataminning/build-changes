import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brj extends brm {
   public static final brj a = new brj(0);
   public static final MapCodec<brj> b = Codec.INT.fieldOf("value").xmap(brj::a, brj::d);
   private final int f;

   public static brj a(int $$0) {
      return $$0 == 0 ? a : new brj($$0);
   }

   private brj(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azv $$0) {
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
   public brn<?> c() {
      return brn.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
