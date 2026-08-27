import java.util.Optional;

public class dit {
   private static final atz a = new atz(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(ib $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<ib> a(int $$0) {
      ib $$1 = switch ($$0) {
         case 0 -> ib.c;
         case 4 -> ib.f;
         case 8 -> ib.d;
         case 12 -> ib.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
