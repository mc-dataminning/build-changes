import com.mojang.serialization.Codec;

public class bfv extends bfy {
   public static final bfv a = new bfv(0);
   public static final Codec<bfv> b = arb.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bfv::new, bfv::d);
   private final int f;

   public static bfv a(int $$0) {
      return $$0 == 0 ? a : new bfv($$0);
   }

   private bfv(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(arx $$0) {
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
   public bfz<?> c() {
      return bfz.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
