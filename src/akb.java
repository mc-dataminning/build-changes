public class akb {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dhm.b();

   public static dhm a(int $$0) {
      return $$0 < 33 ? dhm.n : dhm.a($$0 - 33);
   }

   public static int a(dhm $$0) {
      return 33 + dhm.a($$0);
   }

   public static akl b(int $$0) {
      if ($$0 <= 31) {
         return akl.d;
      } else if ($$0 <= 32) {
         return akl.c;
      } else {
         return $$0 <= 33 ? akl.b : akl.a;
      }
   }

   public static int a(akl $$0) {
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
