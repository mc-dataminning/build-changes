import java.util.function.IntFunction;

public enum fov implements azp {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fov> d = ayc.a(fov::b, values(), ayc.a.b);
   private final int e;
   private final String f;

   private fov(final int $$0, final String $$1) {
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

   public static fov a(int $$0) {
      return d.apply($$0);
   }
}
