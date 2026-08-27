public class akc {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dhe.b();

   public static dhe a(int $$0) {
      return $$0 < 33 ? dhe.n : dhe.a($$0 - 33);
   }

   public static int a(dhe $$0) {
      return 33 + dhe.a($$0);
   }

   public static akm b(int $$0) {
      if ($$0 <= 31) {
         return akm.d;
      } else if ($$0 <= 32) {
         return akm.c;
      } else {
         return $$0 <= 33 ? akm.b : akm.a;
      }
   }

   public static int a(akm $$0) {
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
