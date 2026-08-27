import java.util.function.IntFunction;

public enum eqr {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<eqr> e = aqu.a(eqr::a, values(), aqu.a.b);
   private final int f;
   private final tl g;

   private eqr(int $$0, String $$1) {
      this.f = $$0;
      this.g = tl.c($$1);
   }

   public int a() {
      return this.f;
   }

   public tl b() {
      return this.g;
   }

   public static eqr a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
