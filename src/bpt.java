import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpt extends bpw {
   public static final bpt a = new bpt(0);
   public static final MapCodec<bpt> b = Codec.INT.fieldOf("value").xmap(bpt::a, bpt::d);
   private final int f;

   public static bpt a(int $$0) {
      return $$0 == 0 ? a : new bpt($$0);
   }

   private bpt(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ayw $$0) {
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
   public bpx<?> c() {
      return bpx.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
