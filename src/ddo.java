import com.mojang.serialization.Codec;

public enum ddo implements baj {
   a(buq.f, 11, "helmet"),
   b(buq.e, 16, "chestplate"),
   c(buq.d, 15, "leggings"),
   d(buq.c, 13, "boots"),
   e(buq.g, 16, "body");

   public static final Codec<ddo> f = baj.b(ddo::values);
   private final buq g;
   private final String h;
   private final int i;

   private ddo(final buq $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public buq a() {
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
