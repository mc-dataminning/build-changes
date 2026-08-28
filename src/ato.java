import java.util.Map;

public class ato {
   private static final ato a = new ato(Map.of());
   private final Map<auj<?>, ?> b;

   private ato(Map<auj<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(auj<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ato a() {
      return a;
   }

   public static <T> ato a(auj<T> $$0, T $$1) {
      return new ato(Map.of($$0, $$1));
   }

   public static <T1, T2> ato a(auj<T1> $$0, T1 $$1, auj<T2> $$2, T2 $$3) {
      return new ato(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
