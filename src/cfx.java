import java.util.function.IntFunction;

public enum cfx {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cfx> f = awq.a(cfx::a, values(), awq.a.b);
   private final int g;

   private cfx(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cfx a(int $$0) {
      return f.apply($$0);
   }
}
