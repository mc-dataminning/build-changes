import java.util.function.IntFunction;

public enum chn {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<chn> f = axp.a(chn::a, values(), axp.a.b);
   private final int g;

   private chn(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static chn a(int $$0) {
      return f.apply($$0);
   }
}
