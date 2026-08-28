import com.mojang.serialization.Codec;

public enum ddk implements bag {
   a(bum.f, 11, "helmet"),
   b(bum.e, 16, "chestplate"),
   c(bum.d, 15, "leggings"),
   d(bum.c, 13, "boots"),
   e(bum.g, 16, "body");

   public static final Codec<ddk> f = bag.b(ddk::values);
   private final bum g;
   private final String h;
   private final int i;

   private ddk(final bum $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bum a() {
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
