import java.util.function.IntFunction;

public enum cho {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cho> f = axp.a(cho::a, values(), axp.a.b);
   private final int g;

   private cho(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cho a(int $$0) {
      return f.apply($$0);
   }
}
