public class aps {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dvc.b();

   public static dvc a(int $$0) {
      return $$0 < 33 ? dvc.n : dvc.a($$0 - 33);
   }

   public static int a(dvc $$0) {
      return 33 + dvc.a($$0);
   }

   public static aqd b(int $$0) {
      if ($$0 <= 31) {
         return aqd.d;
      } else if ($$0 <= 32) {
         return aqd.c;
      } else {
         return $$0 <= 33 ? aqd.b : aqd.a;
      }
   }

   public static int a(aqd $$0) {
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
