import java.util.function.IntFunction;

public enum eqr implements arr {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<eqr> d = aqk.a(eqr::a, values(), aqk.a.b);
   private final int e;
   private final String f;

   private eqr(int $$0, String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public String b() {
      return this.f;
   }

   @Override
   public int a() {
      return this.e;
   }

   public static eqr a(int $$0) {
      return d.apply($$0);
   }
}
