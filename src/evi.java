import java.util.function.IntFunction;

public enum evi {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<evi> e = atf.a(evi::a, values(), atf.a.b);
   private final int f;
   private final vf g;

   private evi(int $$0, String $$1) {
      this.f = $$0;
      this.g = vf.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vf b() {
      return this.g;
   }

   public static evi a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
