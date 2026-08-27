import com.mojang.serialization.Codec;

public class bhz extends bic {
   public static final bhz a = new bhz(0);
   public static final Codec<bhz> b = asu.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bhz::new, bhz::d);
   private final int f;

   public static bhz a(int $$0) {
      return $$0 == 0 ? a : new bhz($$0);
   }

   private bhz(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ats $$0) {
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
   public bid<?> c() {
      return bid.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
