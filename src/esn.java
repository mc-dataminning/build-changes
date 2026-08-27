import java.util.function.IntFunction;

public enum esn implements ato {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<esn> d = asf.a(esn::a, values(), asf.a.b);
   private final int e;
   private final String f;

   private esn(int $$0, String $$1) {
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

   public static esn a(int $$0) {
      return d.apply($$0);
   }
}
