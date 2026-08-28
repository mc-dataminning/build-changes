public class axo {
   public static int a(int $$0) {
      return $$0 >>> 24;
   }

   public static int b(int $$0) {
      return $$0 >> 16 & 0xFF;
   }

   public static int c(int $$0) {
      return $$0 >> 8 & 0xFF;
   }

   public static int d(int $$0) {
      return $$0 & 0xFF;
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$0 << 24 | $$1 << 16 | $$2 << 8 | $$3;
   }

   public static int a(int $$0, int $$1, int $$2) {
      return a(255, $$0, $$1, $$2);
   }

   public static int a(eys $$0) {
      return a(b((float)$$0.a()), b((float)$$0.b()), b((float)$$0.c()));
   }

   public static int a(int $$0, int $$1) {
      if ($$0 == -1) {
         return $$1;
      } else {
         return $$1 == -1 ? $$0 : a(a($$0) * a($$1) / 255, b($$0) * b($$1) / 255, c($$0) * c($$1) / 255, d($$0) * d($$1) / 255);
      }
   }

   public static int a(int $$0, float $$1) {
      return a(a($$0), (int)((float)b($$0) * $$1), (int)((float)c($$0) * $$1), (int)((float)d($$0) * $$1));
   }

   public static int b(int $$0, int $$1) {
      return a(a($$0), b($$0) * $$1 / 255, c($$0) * $$1 / 255, d($$0) * $$1 / 255);
   }

   public static int e(int $$0) {
      int $$1 = (int)((float)b($$0) * 0.3F + (float)c($$0) * 0.59F + (float)d($$0) * 0.11F);
      return a($$1, $$1, $$1);
   }

   public static int a(float $$0, int $$1, int $$2) {
      int $$3 = azd.a($$0, a($$1), a($$2));
      int $$4 = azd.a($$0, b($$1), b($$2));
      int $$5 = azd.a($$0, c($$1), c($$2));
      int $$6 = azd.a($$0, d($$1), d($$2));
      return a($$3, $$4, $$5, $$6);
   }

   public static int f(int $$0) {
      return $$0 | 0xFF000000;
   }

   public static int g(int $$0) {
      return $$0 & 16777215;
   }

   public static int c(int $$0, int $$1) {
      return $$0 << 24 | $$1 & 16777215;
   }

   public static int a(float $$0) {
      return b($$0) << 24 | 16777215;
   }

   public static int a(float $$0, float $$1, float $$2, float $$3) {
      return a(b($$0), b($$1), b($$2), b($$3));
   }

   public static int d(int $$0, int $$1) {
      return a((a($$0) + a($$1)) / 2, (b($$0) + b($$1)) / 2, (c($$0) + c($$1)) / 2, (d($$0) + d($$1)) / 2);
   }

   public static int b(float $$0) {
      return azd.d($$0 * 255.0F);
   }

   public static float h(int $$0) {
      return (float)$$0 / 255.0F;
   }

   public static int i(int $$0) {
      return $$0 & -16711936 | ($$0 & 0xFF0000) >> 16 | ($$0 & 0xFF) << 16;
   }

   public static int j(int $$0) {
      return i($$0);
   }
}
