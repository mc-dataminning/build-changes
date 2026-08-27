import java.util.function.IntFunction;

public enum emy implements apc {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<emy> d = anu.a(emy::a, values(), anu.a.b);
   private final int e;
   private final String f;

   private emy(int $$0, String $$1) {
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

   public static emy a(int $$0) {
      return d.apply($$0);
   }
}
