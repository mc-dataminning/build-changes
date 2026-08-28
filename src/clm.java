import java.util.function.IntFunction;

public enum clm {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<clm> f = ayc.a(clm::a, values(), ayc.a.b);
   private final int g;

   private clm(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static clm a(int $$0) {
      return f.apply($$0);
   }
}
