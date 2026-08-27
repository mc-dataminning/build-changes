import java.util.function.IntFunction;

public enum bxx {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bxx> f = arr.a(bxx::a, values(), arr.a.b);
   private final int g;

   private bxx(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bxx a(int $$0) {
      return f.apply($$0);
   }
}
