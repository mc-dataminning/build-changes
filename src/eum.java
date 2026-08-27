import java.util.function.IntFunction;

public enum eum {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<eum> e = asq.a(eum::a, values(), asq.a.b);
   private final int f;
   private final vb g;

   private eum(int $$0, String $$1) {
      this.f = $$0;
      this.g = vb.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vb b() {
      return this.g;
   }

   public static eum a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
