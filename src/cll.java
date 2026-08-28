import java.util.function.IntFunction;

public enum cll {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cll> f = ayc.a(cll::a, values(), ayc.a.b);
   private final int g;

   private cll(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cll a(int $$0) {
      return f.apply($$0);
   }
}
