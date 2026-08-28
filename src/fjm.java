import java.util.function.IntFunction;

public enum fjm implements azp {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<fjm> d = ayd.a(fjm::b, values(), ayd.a.b);
   private final int e;
   private final String f;

   private fjm(final int $$0, final String $$1) {
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

   public static fjm a(int $$0) {
      return d.apply($$0);
   }
}
