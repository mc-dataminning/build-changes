import java.util.function.IntFunction;

public enum clz {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<clz> f = ayg.a(clz::a, values(), ayg.a.b);
   private final int g;

   private clz(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static clz a(int $$0) {
      return f.apply($$0);
   }
}
