public class aqb {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dvx.b();

   public static dvx a(int $$0) {
      return $$0 < 33 ? dvx.n : dvx.a($$0 - 33);
   }

   public static int a(dvx $$0) {
      return 33 + dvx.a($$0);
   }

   public static aqm b(int $$0) {
      if ($$0 <= 31) {
         return aqm.d;
      } else if ($$0 <= 32) {
         return aqm.c;
      } else {
         return $$0 <= 33 ? aqm.b : aqm.a;
      }
   }

   public static int a(aqm $$0) {
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
