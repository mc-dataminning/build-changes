import java.util.function.IntFunction;

public enum fcw {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<fcw> e = awn.a(fcw::a, values(), awn.a.b);
   private final int f;
   private final ws g;

   private fcw(int $$0, String $$1) {
      this.f = $$0;
      this.g = ws.c($$1);
   }

   public int a() {
      return this.f;
   }

   public ws b() {
      return this.g;
   }

   public static fcw a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
