import com.mojang.serialization.Codec;

public class bje extends bjh {
   public static final bje a = new bje(0);
   public static final Codec<bje> b = atx.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bje::new, bje::d);
   private final int f;

   public static bje a(int $$0) {
      return $$0 == 0 ? a : new bje($$0);
   }

   private bje(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(auw $$0) {
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
   public bji<?> c() {
      return bji.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
