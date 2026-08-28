import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpr extends bpu {
   public static final bpr a = new bpr(0);
   public static final MapCodec<bpr> b = Codec.INT.fieldOf("value").xmap(bpr::a, bpr::d);
   private final int f;

   public static bpr a(int $$0) {
      return $$0 == 0 ? a : new bpr($$0);
   }

   private bpr(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azc $$0) {
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
   public bpv<?> c() {
      return bpv.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
