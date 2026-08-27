import java.util.Optional;

public class ddh {
   private static final aph a = new aph(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(ha $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<ha> a(int $$0) {
      ha $$1 = switch ($$0) {
         case 0 -> ha.c;
         case 4 -> ha.f;
         case 8 -> ha.d;
         case 12 -> ha.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
