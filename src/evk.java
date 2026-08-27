import java.util.function.IntFunction;

public enum evk {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<evk> e = atg.a(evk::a, values(), atg.a.b);
   private final int f;
   private final vf g;

   private evk(int $$0, String $$1) {
      this.f = $$0;
      this.g = vf.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vf b() {
      return this.g;
   }

   public static evk a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
