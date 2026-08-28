import java.util.function.IntFunction;

public enum ffr implements ayq {
   a(0, "options.off"),
   b(1, "options.attack.crosshair"),
   c(2, "options.attack.hotbar");

   private static final IntFunction<ffr> d = axd.a(ffr::a, values(), axd.a.b);
   private final int e;
   private final String f;

   private ffr(final int $$0, final String $$1) {
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

   public static ffr a(int $$0) {
      return d.apply($$0);
   }
}
