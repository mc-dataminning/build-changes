import java.util.function.IntFunction;

public enum bwp {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bwp> f = aqn.a(bwp::a, values(), aqn.a.b);
   private final int g;

   private bwp(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bwp a(int $$0) {
      return f.apply($$0);
   }
}
