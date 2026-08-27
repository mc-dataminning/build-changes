public class amm {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dli.b();

   public static dli a(int $$0) {
      return $$0 < 33 ? dli.n : dli.a($$0 - 33);
   }

   public static int a(dli $$0) {
      return 33 + dli.a($$0);
   }

   public static amw b(int $$0) {
      if ($$0 <= 31) {
         return amw.d;
      } else if ($$0 <= 32) {
         return amw.c;
      } else {
         return $$0 <= 33 ? amw.b : amw.a;
      }
   }

   public static int a(amw $$0) {
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
