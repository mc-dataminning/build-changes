public class ami {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dlb.b();

   public static dlb a(int $$0) {
      return $$0 < 33 ? dlb.n : dlb.a($$0 - 33);
   }

   public static int a(dlb $$0) {
      return 33 + dlb.a($$0);
   }

   public static ams b(int $$0) {
      if ($$0 <= 31) {
         return ams.d;
      } else if ($$0 <= 32) {
         return ams.c;
      } else {
         return $$0 <= 33 ? ams.b : ams.a;
      }
   }

   public static int a(ams $$0) {
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
