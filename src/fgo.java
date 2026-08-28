import java.util.function.IntFunction;

public enum fgo {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fgo> e = axe.a(fgo::a, values(), axe.a.b);
   private final int f;
   private final wz g;

   private fgo(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = wz.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wz b() {
      return this.g;
   }

   public static fgo a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
