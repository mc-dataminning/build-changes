import java.util.function.IntFunction;

public enum chp {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<chp> f = axp.a(chp::a, values(), axp.a.b);
   private final int g;

   private chp(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static chp a(int $$0) {
      return f.apply($$0);
   }
}
