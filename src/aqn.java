public class aqn {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + duy.b();

   public static duy a(int $$0) {
      return $$0 < 33 ? duy.n : duy.a($$0 - 33);
   }

   public static int a(duy $$0) {
      return 33 + duy.a($$0);
   }

   public static aqy b(int $$0) {
      if ($$0 <= 31) {
         return aqy.d;
      } else if ($$0 <= 32) {
         return aqy.c;
      } else {
         return $$0 <= 33 ? aqy.b : aqy.a;
      }
   }

   public static int a(aqy $$0) {
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
