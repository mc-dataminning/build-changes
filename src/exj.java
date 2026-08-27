import java.util.function.IntFunction;

public enum exj {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<exj> e = auz.a(exj::a, values(), auz.a.b);
   private final int f;
   private final vq g;

   private exj(int $$0, String $$1) {
      this.f = $$0;
      this.g = vq.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vq b() {
      return this.g;
   }

   public static exj a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
