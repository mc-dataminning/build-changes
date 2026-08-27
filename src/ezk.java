import java.util.function.IntFunction;

public enum ezk {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<ezk> e = avn.a(ezk::a, values(), avn.a.b);
   private final int f;
   private final vu g;

   private ezk(int $$0, String $$1) {
      this.f = $$0;
      this.g = vu.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vu b() {
      return this.g;
   }

   public static ezk a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
