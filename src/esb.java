import java.util.function.IntFunction;

public enum esb implements atk {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<esb> d = asb.a(esb::a, values(), asb.a.b);
   private final int e;
   private final String f;

   private esb(int $$0, String $$1) {
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

   public static esb a(int $$0) {
      return d.apply($$0);
   }
}
