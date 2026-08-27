import java.util.Optional;

public class dqo {
   private static final axv a = new axv(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(ij $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<ij> a(int $$0) {
      ij $$1 = switch ($$0) {
         case 0 -> ij.c;
         case 4 -> ij.f;
         case 8 -> ij.d;
         case 12 -> ij.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
