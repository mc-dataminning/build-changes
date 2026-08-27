import java.util.function.IntFunction;

public enum bxa {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bxa> f = aqu.a(bxa::a, values(), aqu.a.b);
   private final int g;

   private bxa(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bxa a(int $$0) {
      return f.apply($$0);
   }
}
