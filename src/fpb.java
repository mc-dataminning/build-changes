import java.util.function.IntFunction;

public enum fpb {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fpb> e = ayc.a(fpb::a, values(), ayc.a.b);
   private final int f;
   private final wy g;

   private fpb(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = wy.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wy b() {
      return this.g;
   }

   public static fpb a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
