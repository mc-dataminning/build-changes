import java.util.function.IntFunction;

public enum etk {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<etk> e = asj.a(etk::a, values(), asj.a.b);
   private final int f;
   private final uv g;

   private etk(int $$0, String $$1) {
      this.f = $$0;
      this.g = uv.c($$1);
   }

   public int a() {
      return this.f;
   }

   public uv b() {
      return this.g;
   }

   public static etk a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
