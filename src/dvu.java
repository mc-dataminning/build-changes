import java.util.Optional;

public class dvu {
   private static final azn a = new azn(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jj $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jj> a(int $$0) {
      jj $$1 = switch ($$0) {
         case 0 -> jj.c;
         case 4 -> jj.f;
         case 8 -> jj.d;
         case 12 -> jj.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
