import java.util.function.IntFunction;

public enum flm {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<flm> e = axq.a(flm::a, values(), axq.a.b);
   private final int f;
   private final wp g;

   private flm(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = wp.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wp b() {
      return this.g;
   }

   public static flm a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
