import java.util.function.IntFunction;

public enum cdj {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cdj> f = avn.a(cdj::a, values(), avn.a.b);
   private final int g;

   private cdj(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cdj a(int $$0) {
      return f.apply($$0);
   }
}
