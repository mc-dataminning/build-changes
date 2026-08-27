import java.util.function.IntFunction;

public enum erq {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<erq> e = arr.a(erq::a, values(), arr.a.b);
   private final int f;
   private final ui g;

   private erq(int $$0, String $$1) {
      this.f = $$0;
      this.g = ui.c($$1);
   }

   public int a() {
      return this.f;
   }

   public ui b() {
      return this.g;
   }

   public static erq a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
