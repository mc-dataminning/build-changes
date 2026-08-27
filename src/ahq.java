public class ahq {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dec.b();

   public static dec a(int $$0) {
      return $$0 < 33 ? dec.n : dec.a($$0 - 33);
   }

   public static int a(dec $$0) {
      return 33 + dec.a($$0);
   }

   public static ahy b(int $$0) {
      if ($$0 <= 31) {
         return ahy.d;
      } else if ($$0 <= 32) {
         return ahy.c;
      } else {
         return $$0 <= 33 ? ahy.b : ahy.a;
      }
   }

   public static int a(ahy $$0) {
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
