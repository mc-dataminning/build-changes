import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpx extends bqa {
   public static final bpx a = new bpx(0);
   public static final MapCodec<bpx> b = Codec.INT.fieldOf("value").xmap(bpx::a, bpx::d);
   private final int f;

   public static bpx a(int $$0) {
      return $$0 == 0 ? a : new bpx($$0);
   }

   private bpx(int $$0) {
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
   public bqb<?> c() {
      return bqb.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
