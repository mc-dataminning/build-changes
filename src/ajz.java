public class ajz {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dhk.b();

   public static dhk a(int $$0) {
      return $$0 < 33 ? dhk.n : dhk.a($$0 - 33);
   }

   public static int a(dhk $$0) {
      return 33 + dhk.a($$0);
   }

   public static akj b(int $$0) {
      if ($$0 <= 31) {
         return akj.d;
      } else if ($$0 <= 32) {
         return akj.c;
      } else {
         return $$0 <= 33 ? akj.b : akj.a;
      }
   }

   public static int a(akj $$0) {
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
