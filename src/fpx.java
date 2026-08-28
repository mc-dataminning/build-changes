import java.util.function.IntFunction;

public enum fpx implements bac {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fpx> d = ayo.a(fpx::b, values(), ayo.a.b);
   private final int e;
   private final String f;

   private fpx(final int $$0, final String $$1) {
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

   public static fpx a(int $$0) {
      return d.apply($$0);
   }
}
