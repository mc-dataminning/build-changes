public class aof {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dnk.b();

   public static dnk a(int $$0) {
      return $$0 < 33 ? dnk.n : dnk.a($$0 - 33);
   }

   public static int a(dnk $$0) {
      return 33 + dnk.a($$0);
   }

   public static aop b(int $$0) {
      if ($$0 <= 31) {
         return aop.d;
      } else if ($$0 <= 32) {
         return aop.c;
      } else {
         return $$0 <= 33 ? aop.b : aop.a;
      }
   }

   public static int a(aop $$0) {
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
