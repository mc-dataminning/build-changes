import java.util.function.IntFunction;

public enum ezi {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<ezi> e = avn.a(ezi::a, values(), avn.a.b);
   private final int f;
   private final vu g;

   private ezi(int $$0, String $$1) {
      this.f = $$0;
      this.g = vu.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vu b() {
      return this.g;
   }

   public static ezi a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
