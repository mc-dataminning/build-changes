import java.util.function.IntFunction;

public enum clb {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<clb> f = aya.a(clb::a, values(), aya.a.b);
   private final int g;

   private clb(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static clb a(int $$0) {
      return f.apply($$0);
   }
}
