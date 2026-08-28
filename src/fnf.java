import java.util.function.IntFunction;

public enum fnf {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fnf> e = aya.a(fnf::a, values(), aya.a.b);
   private final int f;
   private final wv g;

   private fnf(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = wv.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wv b() {
      return this.g;
   }

   public static fnf a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
