import com.mojang.serialization.Codec;

public enum dig implements bao {
   a(bxf.f, 11, "helmet"),
   b(bxf.e, 16, "chestplate"),
   c(bxf.d, 15, "leggings"),
   d(bxf.c, 13, "boots"),
   e(bxf.g, 16, "body");

   public static final Codec<dig> f = bao.b(dig::values);
   private final bxf g;
   private final String h;
   private final int i;

   private dig(final bxf $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bxf a() {
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
