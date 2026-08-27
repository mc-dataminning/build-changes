import java.util.function.IntFunction;

public enum evt {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<evt> e = ath.a(evt::a, values(), ath.a.b);
   private final int f;
   private final vg g;

   private evt(int $$0, String $$1) {
      this.f = $$0;
      this.g = vg.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vg b() {
      return this.g;
   }

   public static evt a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
