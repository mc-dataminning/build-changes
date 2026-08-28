import java.util.function.IntFunction;

public enum clp {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<clp> f = ayc.a(clp::a, values(), ayc.a.b);
   private final int g;

   private clp(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static clp a(int $$0) {
      return f.apply($$0);
   }
}
