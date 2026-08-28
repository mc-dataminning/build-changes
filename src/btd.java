import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class btd extends btg {
   public static final btd a = new btd(0);
   public static final MapCodec<btd> b = Codec.INT.fieldOf("value").xmap(btd::a, btd::d);
   private final int f;

   public static btd a(int $$0) {
      return $$0 == 0 ? a : new btd($$0);
   }

   private btd(int $$0) {
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
   public bth<?> c() {
      return bth.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
