import java.util.Optional;

public class dgp {
   private static final asf a = new asf(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(hc $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<hc> a(int $$0) {
      hc $$1 = switch ($$0) {
         case 0 -> hc.c;
         case 4 -> hc.f;
         case 8 -> hc.d;
         case 12 -> hc.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
