import com.mojang.serialization.Codec;

public enum des implements azv {
   a(buu.f, 11, "helmet"),
   b(buu.e, 16, "chestplate"),
   c(buu.d, 15, "leggings"),
   d(buu.c, 13, "boots"),
   e(buu.g, 16, "body");

   public static final Codec<des> f = azv.b(des::values);
   private final buu g;
   private final String h;
   private final int i;

   private des(final buu $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public buu a() {
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
