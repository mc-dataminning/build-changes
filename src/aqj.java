public class aqj {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dus.b();

   public static dus a(int $$0) {
      return $$0 < 33 ? dus.n : dus.a($$0 - 33);
   }

   public static int a(dus $$0) {
      return 33 + dus.a($$0);
   }

   public static aqu b(int $$0) {
      if ($$0 <= 31) {
         return aqu.d;
      } else if ($$0 <= 32) {
         return aqu.c;
      } else {
         return $$0 <= 33 ? aqu.b : aqu.a;
      }
   }

   public static int a(aqu $$0) {
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
