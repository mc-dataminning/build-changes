import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bue extends buh {
   public static final bue a = new bue(0);
   public static final MapCodec<bue> b = Codec.INT.fieldOf("value").xmap(bue::a, bue::d);
   private final int f;

   public static bue a(int $$0) {
      return $$0 == 0 ? a : new bue($$0);
   }

   private bue(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(bai $$0) {
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
   public bui<?> c() {
      return bui.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
