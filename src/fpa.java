import java.util.function.IntFunction;

public enum fpa implements azp {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fpa> d = ayc.a(fpa::b, values(), ayc.a.b);
   private final int e;
   private final String f;

   private fpa(final int $$0, final String $$1) {
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

   public static fpa a(int $$0) {
      return d.apply($$0);
   }
}
