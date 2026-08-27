import java.util.function.IntFunction;

public enum cgo {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cgo> f = aww.a(cgo::a, values(), aww.a.b);
   private final int g;

   private cgo(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cgo a(int $$0) {
      return f.apply($$0);
   }
}
