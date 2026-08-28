import java.util.function.IntFunction;

public enum fqk implements azr {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fqk> d = aye.a(fqk::b, values(), aye.a.b);
   private final int e;
   private final String f;

   private fqk(final int $$0, final String $$1) {
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

   public static fqk a(int $$0) {
      return d.apply($$0);
   }
}
