import java.util.Optional;

public class dyc {
   private static final azj a = new azj(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jn $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jn> a(int $$0) {
      jn $$1 = switch ($$0) {
         case 0 -> jn.c;
         case 4 -> jn.f;
         case 8 -> jn.d;
         case 12 -> jn.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
