import java.util.function.IntFunction;

public enum ffi implements aza {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<ffi> d = axo.a(ffi::a, values(), axo.a.b);
   private final int e;
   private final String f;

   private ffi(final int $$0, final String $$1) {
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

   public static ffi a(int $$0) {
      return d.apply($$0);
   }
}
