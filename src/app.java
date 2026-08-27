public class app {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dtc.b();

   public static dtc a(int $$0) {
      return $$0 < 33 ? dtc.n : dtc.a($$0 - 33);
   }

   public static int a(dtc $$0) {
      return 33 + dtc.a($$0);
   }

   public static aqa b(int $$0) {
      if ($$0 <= 31) {
         return aqa.d;
      } else if ($$0 <= 32) {
         return aqa.c;
      } else {
         return $$0 <= 33 ? aqa.b : aqa.a;
      }
   }

   public static int a(aqa $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> 33;
         case c -> 32;
         case d -> 31;
      };
   }

   public static boolean c(int $$0) {
      return $$0 <= 31;
   }

   public static boolean d(int $$0) {
      return $$0 <= 32;
   }

   public static boolean e(int $$0) {
      return $$0 <= a;
   }
}
