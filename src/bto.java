import java.util.function.IntFunction;

public enum bto {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bto> f = anu.a(bto::a, values(), anu.a.b);
   private final int g;

   private bto(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bto a(int $$0) {
      return f.apply($$0);
   }
}
