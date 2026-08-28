import java.util.function.IntFunction;

public enum cgw {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cgw> f = awu.a(cgw::a, values(), awu.a.b);
   private final int g;

   private cgw(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cgw a(int $$0) {
      return f.apply($$0);
   }
}
