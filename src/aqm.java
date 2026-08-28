public class aqm {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + duw.b();

   public static duw a(int $$0) {
      return $$0 < 33 ? duw.n : duw.a($$0 - 33);
   }

   public static int a(duw $$0) {
      return 33 + duw.a($$0);
   }

   public static aqx b(int $$0) {
      if ($$0 <= 31) {
         return aqx.d;
      } else if ($$0 <= 32) {
         return aqx.c;
      } else {
         return $$0 <= 33 ? aqx.b : aqx.a;
      }
   }

   public static int a(aqx $$0) {
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
