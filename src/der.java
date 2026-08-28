import com.mojang.serialization.Codec;

public enum der implements azv {
   a(but.f, 11, "helmet"),
   b(but.e, 16, "chestplate"),
   c(but.d, 15, "leggings"),
   d(but.c, 13, "boots"),
   e(but.g, 16, "body");

   public static final Codec<der> f = azv.b(der::values);
   private final but g;
   private final String h;
   private final int i;

   private der(final but $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public but a() {
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
