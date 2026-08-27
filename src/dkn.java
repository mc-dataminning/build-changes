import java.util.Optional;

public class dkn {
   private static final auz a = new auz(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(ic $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<ic> a(int $$0) {
      ic $$1 = switch ($$0) {
         case 0 -> ic.c;
         case 4 -> ic.f;
         case 8 -> ic.d;
         case 12 -> ic.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
