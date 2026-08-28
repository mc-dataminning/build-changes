import com.mojang.serialization.Codec;

public enum dep implements azu {
   a(bur.f, 11, "helmet"),
   b(bur.e, 16, "chestplate"),
   c(bur.d, 15, "leggings"),
   d(bur.c, 13, "boots"),
   e(bur.g, 16, "body");

   public static final Codec<dep> f = azu.b(dep::values);
   private final bur g;
   private final String h;
   private final int i;

   private dep(final bur $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bur a() {
      return this.g;
   }

   public String b() {
      return this.h;
   }

   @Override
   public String c() {
      return this.h;
   }
}
