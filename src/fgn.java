import java.util.function.IntFunction;

public enum fgn implements ayq {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<fgn> d = axd.a(fgn::a, values(), axd.a.b);
   private final int e;
   private final String f;

   private fgn(final int $$0, final String $$1) {
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

   public static fgn a(int $$0) {
      return d.apply($$0);
   }
}
