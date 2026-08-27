public class aju {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dhb.b();

   public static dhb a(int $$0) {
      return $$0 < 33 ? dhb.n : dhb.a($$0 - 33);
   }

   public static int a(dhb $$0) {
      return 33 + dhb.a($$0);
   }

   public static akd b(int $$0) {
      if ($$0 <= 31) {
         return akd.d;
      } else if ($$0 <= 32) {
         return akd.c;
      } else {
         return $$0 <= 33 ? akd.b : akd.a;
      }
   }

   public static int a(akd $$0) {
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
