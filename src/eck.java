import java.util.Optional;

public class eck {
   private static final baa a = new baa(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jb $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jb> a(int $$0) {
      jb $$1 = switch ($$0) {
         case 0 -> jb.c;
         case 4 -> jb.f;
         case 8 -> jb.d;
         case 12 -> jb.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
