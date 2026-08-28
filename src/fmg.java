import java.util.function.IntFunction;

public enum fmg {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fmg> e = ayv.a(fmg::a, values(), ayv.a.b);
   private final int f;
   private final xv g;

   private fmg(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = xv.c($$1);
   }

   public int a() {
      return this.f;
   }

   public xv b() {
      return this.g;
   }

   public static fmg a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
