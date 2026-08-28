import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsa extends bsd {
   public static final bsa a = new bsa(0);
   public static final MapCodec<bsa> b = Codec.INT.fieldOf("value").xmap(bsa::a, bsa::d);
   private final int f;

   public static bsa a(int $$0) {
      return $$0 == 0 ? a : new bsa($$0);
   }

   private bsa(int $$0) {
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
   public bse<?> c() {
      return bse.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
