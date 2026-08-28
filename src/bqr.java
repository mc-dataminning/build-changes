import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bqr extends bqu {
   public static final bqr a = new bqr(0);
   public static final MapCodec<bqr> b = Codec.INT.fieldOf("value").xmap(bqr::a, bqr::d);
   private final int f;

   public static bqr a(int $$0) {
      return $$0 == 0 ? a : new bqr($$0);
   }

   private bqr(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azl $$0) {
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
   public bqv<?> c() {
      return bqv.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
