public class amn {
   private static final int b = 33;
   private static final int c = 32;
   private static final int d = 31;
   public static final int a = 33 + dlq.b();

   public static dlq a(int $$0) {
      return $$0 < 33 ? dlq.n : dlq.a($$0 - 33);
   }

   public static int a(dlq $$0) {
      return 33 + dlq.a($$0);
   }

   public static amx b(int $$0) {
      if ($$0 <= 31) {
         return amx.d;
      } else if ($$0 <= 32) {
         return amx.c;
      } else {
         return $$0 <= 33 ? amx.b : amx.a;
      }
   }

   public static int a(amx $$0) {
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
