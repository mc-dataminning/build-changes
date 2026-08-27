public class aly {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dkq.b();

   public static dkq a(int $$0) {
      return $$0 < 33 ? dkq.n : dkq.a($$0 - 33);
   }

   public static int a(dkq $$0) {
      return 33 + dkq.a($$0);
   }

   public static ami b(int $$0) {
      if ($$0 <= 31) {
         return ami.d;
      } else if ($$0 <= 32) {
         return ami.c;
      } else {
         return $$0 <= 33 ? ami.b : ami.a;
      }
   }

   public static int a(ami $$0) {
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
