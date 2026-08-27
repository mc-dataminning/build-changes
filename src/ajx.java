public class ajx {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dhf.b();

   public static dhf a(int $$0) {
      return $$0 < 33 ? dhf.n : dhf.a($$0 - 33);
   }

   public static int a(dhf $$0) {
      return 33 + dhf.a($$0);
   }

   public static akg b(int $$0) {
      if ($$0 <= 31) {
         return akg.d;
      } else if ($$0 <= 32) {
         return akg.c;
      } else {
         return $$0 <= 33 ? akg.b : akg.a;
      }
   }

   public static int a(akg $$0) {
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
