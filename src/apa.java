public class apa {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dru.b();

   public static dru a(int $$0) {
      return $$0 < 33 ? dru.n : dru.a($$0 - 33);
   }

   public static int a(dru $$0) {
      return 33 + dru.a($$0);
   }

   public static apl b(int $$0) {
      if ($$0 <= 31) {
         return apl.d;
      } else if ($$0 <= 32) {
         return apl.c;
      } else {
         return $$0 <= 33 ? apl.b : apl.a;
      }
   }

   public static int a(apl $$0) {
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
