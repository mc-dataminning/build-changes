import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class btv extends bty {
   public static final btv a = new btv(0);
   public static final MapCodec<btv> b = Codec.INT.fieldOf("value").xmap(btv::a, btv::d);
   private final int f;

   public static btv a(int $$0) {
      return $$0 == 0 ? a : new btv($$0);
   }

   private btv(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azz $$0) {
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
   public btz<?> c() {
      return btz.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
