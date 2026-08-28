import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bti extends btl {
   public static final bti a = new bti(0);
   public static final MapCodec<bti> b = Codec.INT.fieldOf("value").xmap(bti::a, bti::d);
   private final int f;

   public static bti a(int $$0) {
      return $$0 == 0 ? a : new bti($$0);
   }

   private bti(int $$0) {
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
   public btm<?> c() {
      return btm.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
