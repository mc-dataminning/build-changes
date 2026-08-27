import java.util.function.IntFunction;

public enum est {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<est> e = asb.a(est::a, values(), asb.a.b);
   private final int f;
   private final ur g;

   private est(int $$0, String $$1) {
      this.f = $$0;
      this.g = ur.c($$1);
   }

   public int a() {
      return this.f;
   }

   public ur b() {
      return this.g;
   }

   public static est a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
