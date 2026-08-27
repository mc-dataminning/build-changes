import java.util.function.IntFunction;

public enum evc {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<evc> e = ata.a(evc::a, values(), ata.a.b);
   private final int f;
   private final vd g;

   private evc(int $$0, String $$1) {
      this.f = $$0;
      this.g = vd.c($$1);
   }

   public int a() {
      return this.f;
   }

   public vd b() {
      return this.g;
   }

   public static evc a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
