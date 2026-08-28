import java.util.function.IntFunction;

public enum fpq {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fpq> e = ayc.a(fpq::a, values(), ayc.a.b);
   private final int f;
   private final wy g;

   private fpq(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = wy.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wy b() {
      return this.g;
   }

   public static fpq a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
