import java.util.Optional;

public class dwj {
   private static final azt a = new azt(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jl $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jl> a(int $$0) {
      jl $$1 = switch ($$0) {
         case 0 -> jl.c;
         case 4 -> jl.f;
         case 8 -> jl.d;
         case 12 -> jl.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
