public class avw {
   public static class a {
      public static int a(int $$0) {
         return $$0 >>> 24;
      }

      public static int b(int $$0) {
         return $$0 & 0xFF;
      }

      public static int c(int $$0) {
         return $$0 >> 8 & 0xFF;
      }

      public static int d(int $$0) {
         return $$0 >> 16 & 0xFF;
      }

      public static int e(int $$0) {
         return $$0 & 16777215;
      }

      public static int f(int $$0) {
         return $$0 | 0xFF000000;
      }

      public static int a(int $$0, int $$1, int $$2, int $$3) {
         return $$0 << 24 | $$1 << 16 | $$2 << 8 | $$3;
      }

      public static int a(int $$0, int $$1) {
         return $$0 << 24 | $$1 & 16777215;
      }
   }

   public static class b {
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

      public static int a(int $$0, int $$1) {
         return a(a($$0) * a($$1) / 255, b($$0) * b($$1) / 255, c($$0) * c($$1) / 255, d($$0) * d($$1) / 255);
      }

      public static int a(float $$0, int $$1, int $$2) {
         int $$3 = awm.a($$0, a($$1), a($$2));
         int $$4 = awm.a($$0, b($$1), b($$2));
         int $$5 = awm.a($$0, c($$1), c($$2));
         int $$6 = awm.a($$0, d($$1), d($$2));
         return a($$3, $$4, $$5, $$6);
      }
   }
}
