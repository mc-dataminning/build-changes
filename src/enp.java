import java.util.function.IntFunction;

public enum enp {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<enp> e = anu.a(enp::a, values(), anu.a.b);
   private final int f;
   private final sw g;

   private enp(int $$0, String $$1) {
      this.f = $$0;
      this.g = sw.c($$1);
   }

   public int a() {
      return this.f;
   }

   public sw b() {
      return this.g;
   }

   public static enp a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
