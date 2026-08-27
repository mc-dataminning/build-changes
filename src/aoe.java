public class aoe {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dng.b();

   public static dng a(int $$0) {
      return $$0 < 33 ? dng.n : dng.a($$0 - 33);
   }

   public static int a(dng $$0) {
      return 33 + dng.a($$0);
   }

   public static aoo b(int $$0) {
      if ($$0 <= 31) {
         return aoo.d;
      } else if ($$0 <= 32) {
         return aoo.c;
      } else {
         return $$0 <= 33 ? aoo.b : aoo.a;
      }
   }

   public static int a(aoo $$0) {
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
