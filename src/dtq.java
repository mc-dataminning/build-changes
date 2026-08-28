import java.util.Optional;

public class dtq {
   private static final ayq a = new ayq(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jf $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jf> a(int $$0) {
      jf $$1 = switch ($$0) {
         case 0 -> jf.c;
         case 4 -> jf.f;
         case 8 -> jf.d;
         case 12 -> jf.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
