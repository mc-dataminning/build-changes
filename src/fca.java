import java.util.function.IntFunction;

public enum fca {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fca> e = awd.a(fca::a, values(), awd.a.b);
   private final int f;
   private final wi g;

   private fca(int $$0, String $$1) {
      this.f = $$0;
      this.g = wi.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wi b() {
      return this.g;
   }

   public static fca a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
