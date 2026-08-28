import java.util.Map;

public class ary {
   private static final ary a = new ary(Map.of());
   private final Map<ast<?>, ?> b;

   private ary(Map<ast<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(ast<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ary a() {
      return a;
   }

   public static <T> ary a(ast<T> $$0, T $$1) {
      return new ary(Map.of($$0, $$1));
   }

   public static <T1, T2> ary a(ast<T1> $$0, T1 $$1, ast<T2> $$2, T2 $$3) {
      return new ary(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
