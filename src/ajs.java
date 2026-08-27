public class ajs {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dgz.b();

   public static dgz a(int $$0) {
      return $$0 < 33 ? dgz.n : dgz.a($$0 - 33);
   }

   public static int a(dgz $$0) {
      return 33 + dgz.a($$0);
   }

   public static akb b(int $$0) {
      if ($$0 <= 31) {
         return akb.d;
      } else if ($$0 <= 32) {
         return akb.c;
      } else {
         return $$0 <= 33 ? akb.b : akb.a;
      }
   }

   public static int a(akb $$0) {
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
