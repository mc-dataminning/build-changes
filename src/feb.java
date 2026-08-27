import java.util.function.IntFunction;

public enum feb {
   a(0, "options.narrator.off"),
   b(1, "options.narrator.all"),
   c(2, "options.narrator.chat"),
   d(3, "options.narrator.system");

   private static final IntFunction<feb> e = awv.a(feb::a, values(), awv.a.b);
   private final int f;
   private final wx g;

   private feb(int $$0, String $$1) {
      this.f = $$0;
      this.g = wx.c($$1);
   }

   public int a() {
      return this.f;
   }

   public wx b() {
      return this.g;
   }

   public static feb a(int $$0) {
      return e.apply($$0);
   }

   public boolean c() {
      return this == b || this == c;
   }

   public boolean d() {
      return this == b || this == d;
   }
}
