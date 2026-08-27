import java.util.function.IntFunction;

public enum eqo {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<eqo> e = aqk.a(eqo::a, values(), aqk.a.b);
   private final int f;
   private final tf g;

   private eqo(int $$0, String $$1) {
      this.f = $$0;
      this.g = tf.c($$1);
   }

   public int a() {
      return this.f;
   }

   public tf b() {
      return this.g;
   }

   public static eqo a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
