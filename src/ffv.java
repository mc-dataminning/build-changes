import java.util.function.IntFunction;

public enum ffv {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<ffv> e = aww.a(ffv::a, values(), aww.a.b);
   private final int f;
   private final wu g;

   private ffv(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = wu.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wu b() {
      return this.g;
   }

   public static ffv a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
