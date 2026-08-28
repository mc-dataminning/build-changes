import java.util.function.IntFunction;

public enum chl {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<chl> f = axo.a(chl::a, values(), axo.a.b);
   private final int g;

   private chl(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static chl a(int $$0) {
      return f.apply($$0);
   }
}
