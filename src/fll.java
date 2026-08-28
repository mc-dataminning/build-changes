import java.util.function.IntFunction;

public enum fll {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fll> e = axq.a(fll::a, values(), axq.a.b);
   private final int f;
   private final wo g;

   private fll(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = wo.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wo b() {
      return this.g;
   }

   public static fll a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
