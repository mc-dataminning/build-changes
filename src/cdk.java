import java.util.function.IntFunction;

public enum cdk {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cdk> f = avn.a(cdk::a, values(), avn.a.b);
   private final int g;

   private cdk(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cdk a(int $$0) {
      return f.apply($$0);
   }
}
