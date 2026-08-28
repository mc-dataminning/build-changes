import com.mojang.serialization.Codec;

public enum dhj implements bak {
   a(bwp.f, 11, "helmet"),
   b(bwp.e, 16, "chestplate"),
   c(bwp.d, 15, "leggings"),
   d(bwp.c, 13, "boots"),
   e(bwp.g, 16, "body");

   public static final Codec<dhj> f = bak.b(dhj::values);
   private final bwp g;
   private final String h;
   private final int i;

   private dhj(final bwp $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bwp a() {
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
