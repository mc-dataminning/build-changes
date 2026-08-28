import java.util.function.IntFunction;

public enum fhx implements azi {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fhx> d = axw.a(fhx::b, values(), axw.a.b);
   private final int e;
   private final String f;

   private fhx(final int $$0, final String $$1) {
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

   public static fhx a(int $$0) {
      return d.apply($$0);
   }
}
