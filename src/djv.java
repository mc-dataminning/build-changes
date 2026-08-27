import java.util.Optional;

public class djv {
   private static final aui a = new aui(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(ia $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<ia> a(int $$0) {
      ia $$1 = switch ($$0) {
         case 0 -> ia.c;
         case 4 -> ia.f;
         case 8 -> ia.d;
         case 12 -> ia.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
