import java.util.Optional;

public class dzs {
   private static final azu a = new azu(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jo $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jo> a(int $$0) {
      jo $$1 = switch ($$0) {
         case 0 -> jo.c;
         case 4 -> jo.f;
         case 8 -> jo.d;
         case 12 -> jo.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
