import com.mojang.serialization.Codec;

public enum dfz implements bag {
   a(bwc.f, 11, "helmet"),
   b(bwc.e, 16, "chestplate"),
   c(bwc.d, 15, "leggings"),
   d(bwc.c, 13, "boots"),
   e(bwc.g, 16, "body");

   public static final Codec<dfz> f = bag.b(dfz::values);
   private final bwc g;
   private final String h;
   private final int i;

   private dfz(final bwc $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bwc a() {
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
