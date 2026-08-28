import java.util.function.IntFunction;

public enum clx {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<clx> f = aye.a(clx::a, values(), aye.a.b);
   private final int g;

   private clx(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static clx a(int $$0) {
      return f.apply($$0);
   }
}
