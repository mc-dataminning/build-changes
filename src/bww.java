import java.util.function.IntFunction;

public enum bww {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bww> f = aqt.a(bww::a, values(), aqt.a.b);
   private final int g;

   private bww(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bww a(int $$0) {
      return f.apply($$0);
   }
}
