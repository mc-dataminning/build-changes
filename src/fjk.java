import java.util.function.IntFunction;

public enum fjk {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fjk> e = ayb.a(fjk::a, values(), ayb.a.b);
   private final int f;
   private final xi g;

   private fjk(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = xi.c($$1);
   }

   public int a() {
      return this.f;
   }

   public xi b() {
      return this.g;
   }

   public static fjk a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
