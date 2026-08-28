import com.mojang.serialization.Codec;

public enum dfr implements bba {
   a(bvs.f, 11, "helmet"),
   b(bvs.e, 16, "chestplate"),
   c(bvs.d, 15, "leggings"),
   d(bvs.c, 13, "boots"),
   e(bvs.g, 16, "body");

   public static final Codec<dfr> f = bba.b(dfr::values);
   private final bvs g;
   private final String h;
   private final int i;

   private dfr(final bvs $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bvs a() {
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
