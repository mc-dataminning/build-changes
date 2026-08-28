import java.util.function.IntFunction;

public enum arp implements azx {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<arp> d = ayl.a(arp::b, values(), ayl.a.b);
   private final int e;
   private final String f;

   private arp(final int $$0, final String $$1) {
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

   public static arp a(int $$0) {
      return d.apply($$0);
   }
}
