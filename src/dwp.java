import java.util.Optional;

public class dwp {
   private static final azu a = new azu(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jm $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jm> a(int $$0) {
      jm $$1 = switch ($$0) {
         case 0 -> jm.c;
         case 4 -> jm.f;
         case 8 -> jm.d;
         case 12 -> jm.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
