import java.util.function.IntFunction;

public enum fqm implements azt {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fqm> d = ayg.a(fqm::b, values(), ayg.a.b);
   private final int e;
   private final String f;

   private fqm(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   public String a() {
      return this.f;
   }

   public static fqm a(int $$0) {
      return d.apply($$0);
   }
}
