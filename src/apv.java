public class apv {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dty.b();

   public static dty a(int $$0) {
      return $$0 < 33 ? dty.n : dty.a($$0 - 33);
   }

   public static int a(dty $$0) {
      return 33 + dty.a($$0);
   }

   public static aqg b(int $$0) {
      if ($$0 <= 31) {
         return aqg.d;
      } else if ($$0 <= 32) {
         return aqg.c;
      } else {
         return $$0 <= 33 ? aqg.b : aqg.a;
      }
   }

   public static int a(aqg $$0) {
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
