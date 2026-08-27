import java.util.function.IntFunction;

public enum fcz implements axy {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<fcz> d = awn.a(fcz::a, values(), awn.a.b);
   private final int e;
   private final String f;

   private fcz(int $$0, String $$1) {
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

   public static fcz a(int $$0) {
      return d.apply($$0);
   }
}
