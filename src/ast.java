import java.util.Map;

public class ast {
   private static final ast a = new ast(Map.of());
   private final Map<ato<?>, ?> b;

   private ast(Map<ato<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(ato<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ast a() {
      return a;
   }

   public static <T> ast a(ato<T> $$0, T $$1) {
      return new ast(Map.of($$0, $$1));
   }

   public static <T1, T2> ast a(ato<T1> $$0, T1 $$1, ato<T2> $$2, T2 $$3) {
      return new ast(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
