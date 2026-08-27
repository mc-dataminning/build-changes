import java.util.Optional;

public class dui {
   private static final ayv a = new ayv(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(iw $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<iw> a(int $$0) {
      iw $$1 = switch ($$0) {
         case 0 -> iw.c;
         case 4 -> iw.f;
         case 8 -> iw.d;
         case 12 -> iw.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
