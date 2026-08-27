import java.util.function.IntFunction;

public enum eym {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<eym> e = ave.a(eym::a, values(), ave.a.b);
   private final int f;
   private final vs g;

   private eym(int $$0, String $$1) {
      this.f = $$0;
      this.g = vs.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vs b() {
      return this.g;
   }

   public static eym a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
