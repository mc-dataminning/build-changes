import java.util.Optional;

public class dvy {
   private static final azp a = new azp(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jk $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jk> a(int $$0) {
      jk $$1 = switch ($$0) {
         case 0 -> jk.c;
         case 4 -> jk.f;
         case 8 -> jk.d;
         case 12 -> jk.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
