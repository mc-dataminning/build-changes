import java.util.function.IntFunction;

public enum ffi {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<ffi> e = axp.a(ffi::a, values(), axp.a.b);
   private final int f;
   private final xp g;

   private ffi(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = xp.c($$1);
   }

   public int a() {
      return this.f;
   }

   public xp b() {
      return this.g;
   }

   public static ffi a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
