import java.util.function.IntFunction;

public enum fgr implements ayr {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<fgr> d = axe.a(fgr::a, values(), axe.a.b);
   private final int e;
   private final String f;

   private fgr(final int $$0, final String $$1) {
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

   public static fgr a(int $$0) {
      return d.apply($$0);
   }
}
