import java.util.Map;

public class aqi {
   private static final aqi a = new aqi(Map.of());
   private final Map<arb<?>, ?> b;

   private aqi(Map<arb<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(arb<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aqi a() {
      return a;
   }

   public static <T> aqi a(arb<T> $$0, T $$1) {
      return new aqi(Map.of($$0, $$1));
   }

   public static <T1, T2> aqi a(arb<T1> $$0, T1 $$1, arb<T2> $$2, T2 $$3) {
      return new aqi(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
