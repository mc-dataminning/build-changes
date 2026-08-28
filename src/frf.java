import java.util.function.IntFunction;

public enum frf {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<frf> e = aye.a(frf::a, values(), aye.a.b);
   private final int f;
   private final xa g;

   private frf(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = xa.c($$1);
   }

   public int a() {
      return this.f;
   }

   public xa b() {
      return this.g;
   }

   public static frf a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
