import java.util.function.IntFunction;

public enum fep implements azc {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fep> d = axp.a(fep::a, values(), axp.a.b);
   private final int e;
   private final String f;

   private fep(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public int a() {
      return this.e;
   }

   @Override
   public String b() {
      return this.f;
   }

   public static fep a(int $$0) {
      return d.apply($$0);
   }
}
