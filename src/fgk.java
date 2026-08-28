import java.util.function.IntFunction;

public enum fgk {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fgk> e = axd.a(fgk::a, values(), axd.a.b);
   private final int f;
   private final wy g;

   private fgk(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = wy.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wy b() {
      return this.g;
   }

   public static fgk a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
