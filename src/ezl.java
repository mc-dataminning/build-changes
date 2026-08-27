import java.util.function.IntFunction;

public enum ezl implements awy {
   a(0, "options.particles.all"),
   b(1, "options.particles.decreased"),
   c(2, "options.particles.minimal");

   private static final IntFunction<ezl> d = avn.a(ezl::a, values(), avn.a.b);
   private final int e;
   private final String f;

   private ezl(int $$0, String $$1) {
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

   public static ezl a(int $$0) {
      return d.apply($$0);
   }
}
