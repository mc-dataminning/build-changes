import java.util.function.IntFunction;

public enum ffg {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<ffg> e = axo.a(ffg::a, values(), axo.a.b);
   private final int f;
   private final xo g;

   private ffg(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = xo.c($$1);
   }

   public int a() {
      return this.f;
   }

   public xo b() {
      return this.g;
   }

   public static ffg a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
