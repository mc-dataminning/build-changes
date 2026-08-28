import com.mojang.serialization.Codec;

public enum dfq implements bba {
   a(bvr.f, 11, "helmet"),
   b(bvr.e, 16, "chestplate"),
   c(bvr.d, 15, "leggings"),
   d(bvr.c, 13, "boots"),
   e(bvr.g, 16, "body");

   public static final Codec<dfq> f = bba.b(dfq::values);
   private final bvr g;
   private final String h;
   private final int i;

   private dfq(final bvr $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bvr a() {
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
