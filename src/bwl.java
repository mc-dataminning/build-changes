import java.util.function.IntFunction;

public enum bwl {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bwl> f = aqi.a(bwl::a, values(), aqi.a.b);
   private final int g;

   private bwl(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bwl a(int $$0) {
      return f.apply($$0);
   }
}
