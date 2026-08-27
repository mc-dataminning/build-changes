import java.util.function.IntFunction;

public enum eqz {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<eqz> e = aqt.a(eqz::a, values(), aqt.a.b);
   private final int f;
   private final tn g;

   private eqz(int $$0, String $$1) {
      this.f = $$0;
      this.g = tn.c($$1);
   }

   public int a() {
      return this.f;
   }

   public tn b() {
      return this.g;
   }

   public static eqz a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
