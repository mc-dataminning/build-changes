import java.util.function.IntFunction;

public enum ccs {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<ccs> f = ave.a(ccs::a, values(), ave.a.b);
   private final int g;

   private ccs(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static ccs a(int $$0) {
      return f.apply($$0);
   }
}
