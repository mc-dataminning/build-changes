import java.util.Optional;

public class dre {
   private static final ayf a = new ayf(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(ir $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<ir> a(int $$0) {
      ir $$1 = switch ($$0) {
         case 0 -> ir.c;
         case 4 -> ir.f;
         case 8 -> ir.d;
         case 12 -> ir.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
