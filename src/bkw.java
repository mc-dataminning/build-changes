import com.mojang.serialization.Codec;

public class bkw extends bkz {
   public static final bkw a = new bkw(0);
   public static final Codec<bkw> b = avp.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bkw::new, bkw::d);
   private final int f;

   public static bkw a(int $$0) {
      return $$0 == 0 ? a : new bkw($$0);
   }

   private bkw(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(awo $$0) {
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
   public bla<?> c() {
      return bla.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
