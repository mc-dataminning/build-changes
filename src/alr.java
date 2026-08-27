public class alr {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + djo.b();

   public static djo a(int $$0) {
      return $$0 < 33 ? djo.n : djo.a($$0 - 33);
   }

   public static int a(djo $$0) {
      return 33 + djo.a($$0);
   }

   public static amb b(int $$0) {
      if ($$0 <= 31) {
         return amb.d;
      } else if ($$0 <= 32) {
         return amb.c;
      } else {
         return $$0 <= 33 ? amb.b : amb.a;
      }
   }

   public static int a(amb $$0) {
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
