import com.mojang.serialization.Codec;

public enum dht implements bak {
   a(bws.f, 11, "helmet"),
   b(bws.e, 16, "chestplate"),
   c(bws.d, 15, "leggings"),
   d(bws.c, 13, "boots"),
   e(bws.g, 16, "body");

   public static final Codec<dht> f = bak.b(dht::values);
   private final bws g;
   private final String h;
   private final int i;

   private dht(final bws $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bws a() {
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
