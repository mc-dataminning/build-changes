import java.util.function.IntFunction;

public enum ccd {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<ccd> f = ava.a(ccd::a, values(), ava.a.b);
   private final int g;

   private ccd(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static ccd a(int $$0) {
      return f.apply($$0);
   }
}
