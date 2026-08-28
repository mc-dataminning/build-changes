import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsc extends bsf {
   public static final bsc a = new bsc(0);
   public static final MapCodec<bsc> b = Codec.INT.fieldOf("value").xmap(bsc::a, bsc::d);
   private final int f;

   public static bsc a(int $$0) {
      return $$0 == 0 ? a : new bsc($$0);
   }

   private bsc(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(bac $$0) {
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
   public bsg<?> c() {
      return bsg.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
