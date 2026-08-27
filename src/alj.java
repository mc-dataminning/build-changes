public class alj {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dix.b();

   public static dix a(int $$0) {
      return $$0 < 33 ? dix.n : dix.a($$0 - 33);
   }

   public static int a(dix $$0) {
      return 33 + dix.a($$0);
   }

   public static alt b(int $$0) {
      if ($$0 <= 31) {
         return alt.d;
      } else if ($$0 <= 32) {
         return alt.c;
      } else {
         return $$0 <= 33 ? alt.b : alt.a;
      }
   }

   public static int a(alt $$0) {
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
