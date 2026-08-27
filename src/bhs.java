import com.mojang.serialization.Codec;

public class bhs extends bhv {
   public static final bhs a = new bhs(0);
   public static final Codec<bhs> b = asq.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bhs::new, bhs::d);
   private final int f;

   public static bhs a(int $$0) {
      return $$0 == 0 ? a : new bhs($$0);
   }

   private bhs(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ato $$0) {
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
   public bhw<?> c() {
      return bhw.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
