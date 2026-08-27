import java.util.Optional;

public class dnk {
   private static final awv a = new awv(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(ih $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<ih> a(int $$0) {
      ih $$1 = switch ($$0) {
         case 0 -> ih.c;
         case 4 -> ih.f;
         case 8 -> ih.d;
         case 12 -> ih.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
