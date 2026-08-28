import com.mojang.serialization.Codec;

public enum dfj implements azv {
   a(bvj.f, 11, "helmet"),
   b(bvj.e, 16, "chestplate"),
   c(bvj.d, 15, "leggings"),
   d(bvj.c, 13, "boots"),
   e(bvj.g, 16, "body");

   public static final Codec<dfj> f = azv.b(dfj::values);
   private final bvj g;
   private final String h;
   private final int i;

   private dfj(final bvj $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bvj a() {
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
