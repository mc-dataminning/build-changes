import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class brl extends bro {
   public static final brl a = new brl(0);
   public static final MapCodec<brl> b = Codec.INT.fieldOf("value").xmap(brl::a, brl::d);
   private final int f;

   public static brl a(int $$0) {
      return $$0 == 0 ? a : new brl($$0);
   }

   private brl(int $$0) {
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
   public brp<?> c() {
      return brp.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
