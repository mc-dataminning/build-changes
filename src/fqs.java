import java.util.function.IntFunction;

public enum fqs {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fqs> e = ayo.a(fqs::a, values(), ayo.a.b);
   private final int f;
   private final xg g;

   private fqs(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = xg.c($$1);
   }

   public int a() {
      return this.f;
   }

   public xg b() {
      return this.g;
   }

   public static fqs a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
