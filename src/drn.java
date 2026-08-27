import java.util.Optional;

public class drn {
   private static final ayi a = new ayi(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(is $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<is> a(int $$0) {
      is $$1 = switch ($$0) {
         case 0 -> is.c;
         case 4 -> is.f;
         case 8 -> is.d;
         case 12 -> is.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
