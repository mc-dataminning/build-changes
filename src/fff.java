import java.util.function.IntFunction;

public enum fff implements ayx {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<fff> d = axl.a(fff::a, values(), axl.a.b);
   private final int e;
   private final String f;

   private fff(final int $$0, final String $$1) {
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

   public static fff a(int $$0) {
      return d.apply($$0);
   }
}
