public class apu {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dtw.b();

   public static dtw a(int $$0) {
      return $$0 < 33 ? dtw.n : dtw.a($$0 - 33);
   }

   public static int a(dtw $$0) {
      return 33 + dtw.a($$0);
   }

   public static aqf b(int $$0) {
      if ($$0 <= 31) {
         return aqf.d;
      } else if ($$0 <= 32) {
         return aqf.c;
      } else {
         return $$0 <= 33 ? aqf.b : aqf.a;
      }
   }

   public static int a(aqf $$0) {
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
