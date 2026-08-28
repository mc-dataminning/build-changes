import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsl extends bso {
   public static final bsl a = new bsl(0);
   public static final MapCodec<bsl> b = Codec.INT.fieldOf("value").xmap(bsl::a, bsl::d);
   private final int f;

   public static bsl a(int $$0) {
      return $$0 == 0 ? a : new bsl($$0);
   }

   private bsl(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(bam $$0) {
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
   public bsp<?> c() {
      return bsp.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
