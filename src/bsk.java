import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bsk extends bsn {
   public static final bsk a = new bsk(0);
   public static final MapCodec<bsk> b = Codec.INT.fieldOf("value").xmap(bsk::a, bsk::d);
   private final int f;

   public static bsk a(int $$0) {
      return $$0 == 0 ? a : new bsk($$0);
   }

   private bsk(int $$0) {
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
   public bso<?> c() {
      return bso.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
