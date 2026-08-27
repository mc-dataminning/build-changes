public class amm {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dlh.b();

   public static dlh a(int $$0) {
      return $$0 < 33 ? dlh.n : dlh.a($$0 - 33);
   }

   public static int a(dlh $$0) {
      return 33 + dlh.a($$0);
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
