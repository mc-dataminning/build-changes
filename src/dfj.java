import com.mojang.serialization.Codec;

public enum dfj implements bba {
   a(bvn.f, 11, "helmet"),
   b(bvn.e, 16, "chestplate"),
   c(bvn.d, 15, "leggings"),
   d(bvn.c, 13, "boots"),
   e(bvn.g, 16, "body");

   public static final Codec<dfj> f = bba.b(dfj::values);
   private final bvn g;
   private final String h;
   private final int i;

   private dfj(final bvn $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bvn a() {
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
