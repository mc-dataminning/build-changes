import java.util.function.IntFunction;

public enum chi {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<chi> f = axl.a(chi::a, values(), axl.a.b);
   private final int g;

   private chi(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static chi a(int $$0) {
      return f.apply($$0);
   }
}
