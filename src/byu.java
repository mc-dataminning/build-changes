import java.util.function.IntFunction;

public enum byu {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<byu> f = asf.a(byu::a, values(), asf.a.b);
   private final int g;

   private byu(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static byu a(int $$0) {
      return f.apply($$0);
   }
}
