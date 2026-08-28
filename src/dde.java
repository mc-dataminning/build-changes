import com.mojang.serialization.Codec;

public enum dde implements baf {
   a(buh.f, 11, "helmet"),
   b(buh.e, 16, "chestplate"),
   c(buh.d, 15, "leggings"),
   d(buh.c, 13, "boots"),
   e(buh.g, 16, "body");

   public static final Codec<dde> f = baf.b(dde::values);
   private final buh g;
   private final String h;
   private final int i;

   private dde(final buh $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public buh a() {
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
