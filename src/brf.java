import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brf extends bri {
   public static final brf a = new brf(0);
   public static final MapCodec<brf> b = Codec.INT.fieldOf("value").xmap(brf::a, brf::d);
   private final int f;

   public static brf a(int $$0) {
      return $$0 == 0 ? a : new brf($$0);
   }

   private brf(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azs $$0) {
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
   public brj<?> c() {
      return brj.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
