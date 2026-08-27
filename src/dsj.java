import java.util.Optional;

public class dsj {
   private static final ayo a = new ayo(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(it $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<it> a(int $$0) {
      it $$1 = switch ($$0) {
         case 0 -> it.c;
         case 4 -> it.f;
         case 8 -> it.d;
         case 12 -> it.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
