import java.util.function.IntFunction;

public enum fmb {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fmb> e = ayl.a(fmb::a, values(), ayl.a.b);
   private final int f;
   private final xk g;

   private fmb(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = xk.c($$1);
   }

   public int a() {
      return this.f;
   }

   public xk b() {
      return this.g;
   }

   public static fmb a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
