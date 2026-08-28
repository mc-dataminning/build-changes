import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsg extends bsj {
   public static final bsg a = new bsg(0);
   public static final MapCodec<bsg> b = Codec.INT.fieldOf("value").xmap(bsg::a, bsg::d);
   private final int f;

   public static bsg a(int $$0) {
      return $$0 == 0 ? a : new bsg($$0);
   }

   private bsg(int $$0) {
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
   public bsk<?> c() {
      return bsk.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
