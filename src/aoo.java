public class aoo {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dpa.b();

   public static dpa a(int $$0) {
      return $$0 < 33 ? dpa.n : dpa.a($$0 - 33);
   }

   public static int a(dpa $$0) {
      return 33 + dpa.a($$0);
   }

   public static aoy b(int $$0) {
      if ($$0 <= 31) {
         return aoy.d;
      } else if ($$0 <= 32) {
         return aoy.c;
      } else {
         return $$0 <= 33 ? aoy.b : aoy.a;
      }
   }

   public static int a(aoy $$0) {
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
