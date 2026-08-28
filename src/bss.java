import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bss extends bsv {
   public static final bss a = new bss(0);
   public static final MapCodec<bss> b = Codec.INT.fieldOf("value").xmap(bss::a, bss::d);
   private final int f;

   public static bss a(int $$0) {
      return $$0 == 0 ? a : new bss($$0);
   }

   private bss(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azs $$0) {
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
   public bsw<?> c() {
      return bsw.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
