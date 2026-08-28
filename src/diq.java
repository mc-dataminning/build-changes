import com.mojang.serialization.Codec;

public enum diq implements bax {
   a(bxo.f, 11, "helmet"),
   b(bxo.e, 16, "chestplate"),
   c(bxo.d, 15, "leggings"),
   d(bxo.c, 13, "boots"),
   e(bxo.g, 16, "body");

   public static final Codec<diq> f = bax.b(diq::values);
   private final bxo g;
   private final String h;
   private final int i;

   private diq(final bxo $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bxo a() {
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
