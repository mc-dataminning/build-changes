import com.mojang.serialization.Codec;

public class bgg extends bgj {
   public static final bgg a = new bgg(0);
   public static final Codec<bgg> b = arj.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bgg::new, bgg::d);
   private final int f;

   public static bgg a(int $$0) {
      return $$0 == 0 ? a : new bgg($$0);
   }

   private bgg(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ash $$0) {
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
   public bgk<?> c() {
      return bgk.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
