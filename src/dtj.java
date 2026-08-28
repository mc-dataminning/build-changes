import java.util.Optional;

public class dtj {
   private static final azj a = new azj(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(je $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<je> a(int $$0) {
      je $$1 = switch ($$0) {
         case 0 -> je.c;
         case 4 -> je.f;
         case 8 -> je.d;
         case 12 -> je.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
