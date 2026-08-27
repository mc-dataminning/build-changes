import java.util.function.IntFunction;

public enum eqs {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<eqs> e = aqn.a(eqs::a, values(), aqn.a.b);
   private final int f;
   private final ti g;

   private eqs(int $$0, String $$1) {
      this.f = $$0;
      this.g = ti.c($$1);
   }

   public int a() {
      return this.f;
   }

   public ti b() {
      return this.g;
   }

   public static eqs a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
