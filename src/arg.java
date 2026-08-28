import java.util.function.IntFunction;

public enum arg implements azn {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<arg> d = aya.a(arg::b, values(), aya.a.b);
   private final int e;
   private final String f;

   private arg(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public String a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.e;
   }

   public static arg a(int $$0) {
      return d.apply($$0);
   }
}
