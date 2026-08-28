import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpi extends bpl {
   public static final bpi a = new bpi(0);
   public static final MapCodec<bpi> b = Codec.INT.fieldOf("value").xmap(bpi::a, bpi::d);
   private final int f;

   public static bpi a(int $$0) {
      return $$0 == 0 ? a : new bpi($$0);
   }

   private bpi(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ayo $$0) {
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
   public bpm<?> c() {
      return bpm.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
