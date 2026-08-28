import java.util.function.IntFunction;

public enum fiq implements azn {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fiq> d = ayb.a(fiq::b, values(), ayb.a.b);
   private final int e;
   private final String f;

   private fiq(final int $$0, final String $$1) {
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

   public static fiq a(int $$0) {
      return d.apply($$0);
   }
}
