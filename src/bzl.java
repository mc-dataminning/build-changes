import java.util.function.IntFunction;

public enum bzl {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<bzl> f = asq.a(bzl::a, values(), asq.a.b);
   private final int g;

   private bzl(int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static bzl a(int $$0) {
      return f.apply($$0);
   }
}
