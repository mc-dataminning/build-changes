import com.mojang.serialization.Codec;

public class bme extends bmh {
   public static final bme a = new bme(0);
   public static final Codec<bme> b = awe.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bme::new, bme::d);
   private final int f;

   public static bme a(int $$0) {
      return $$0 == 0 ? a : new bme($$0);
   }

   private bme(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(axd $$0) {
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
   public bmi<?> c() {
      return bmi.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
