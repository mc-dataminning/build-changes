import java.util.function.IntFunction;

public enum fgl {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fgl> e = axd.a(fgl::a, values(), axd.a.b);
   private final int f;
   private final xe g;

   private fgl(int $$0, String $$1) {
      this.f = $$0;
      this.g = xe.c($$1);
   }

   public int a() {
      return this.f;
   }

   public xe b() {
      return this.g;
   }

   public static fgl a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
