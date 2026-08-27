import java.util.function.IntFunction;

public enum evw implements aur {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<evw> d = ath.a(evw::a, values(), ath.a.b);
   private final int e;
   private final String f;

   private evw(int $$0, String $$1) {
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

   public static evw a(int $$0) {
      return d.apply($$0);
   }
}
