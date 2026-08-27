import java.util.function.IntFunction;

public enum eqp {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<eqp> e = aqi.a(eqp::a, values(), aqi.a.b);
   private final int f;
   private final te g;

   private eqp(int $$0, String $$1) {
      this.f = $$0;
      this.g = te.c($$1);
   }

   public int a() {
      return this.f;
   }

   public te b() {
      return this.g;
   }

   public static eqp a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
