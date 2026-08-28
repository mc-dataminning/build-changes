import java.util.Optional;

public class ecw {
   private static final bal a = new bal(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jc $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jc> a(int $$0) {
      jc $$1 = switch ($$0) {
         case 0 -> jc.c;
         case 4 -> jc.f;
         case 8 -> jc.d;
         case 12 -> jc.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
