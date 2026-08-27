public class aoj {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dof.b();

   public static dof a(int $$0) {
      return $$0 < 33 ? dof.n : dof.a($$0 - 33);
   }

   public static int a(dof $$0) {
      return 33 + dof.a($$0);
   }

   public static aot b(int $$0) {
      if ($$0 <= 31) {
         return aot.d;
      } else if ($$0 <= 32) {
         return aot.c;
      } else {
         return $$0 <= 33 ? aot.b : aot.a;
      }
   }

   public static int a(aot $$0) {
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
