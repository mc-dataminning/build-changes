import java.util.function.IntFunction;

public enum ffy implements ayj {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<ffy> d = aww.a(ffy::a, values(), aww.a.b);
   private final int e;
   private final String f;

   private ffy(final int $$0, final String $$1) {
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

   public static ffy a(int $$0) {
      return d.apply($$0);
   }
}
