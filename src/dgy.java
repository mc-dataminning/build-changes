import com.mojang.serialization.Codec;

public enum dgy implements bai {
   a(bwk.f, 11, "helmet"),
   b(bwk.e, 16, "chestplate"),
   c(bwk.d, 15, "leggings"),
   d(bwk.c, 13, "boots"),
   e(bwk.g, 16, "body");

   public static final Codec<dgy> f = bai.b(dgy::values);
   private final bwk g;
   private final String h;
   private final int i;

   private dgy(final bwk $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bwk a() {
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
