import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bqm extends bqp {
   public static final bqm a = new bqm(0);
   public static final MapCodec<bqm> b = Codec.INT.fieldOf("value").xmap(bqm::a, bqm::d);
   private final int f;

   public static bqm a(int $$0) {
      return $$0 == 0 ? a : new bqm($$0);
   }

   private bqm(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azk $$0) {
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
   public bqq<?> c() {
      return bqq.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
