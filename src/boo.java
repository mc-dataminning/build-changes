import com.mojang.serialization.Codec;

public class boo extends bor {
   public static final boo a = new boo(0);
   public static final Codec<boo> b = axh.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(boo::new, boo::d);
   private final int f;

   public static boo a(int $$0) {
      return $$0 == 0 ? a : new boo($$0);
   }

   private boo(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ayg $$0) {
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
   public bos<?> c() {
      return bos.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
