import java.util.function.IntFunction;

public enum epv implements arr {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<epv> d = aqk.a(epv::a, values(), aqk.a.b);
   private final int e;
   private final String f;

   private epv(int $$0, String $$1) {
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

   public static epv a(int $$0) {
      return d.apply($$0);
   }
}
