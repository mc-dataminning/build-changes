import java.util.Map;

public class aqh {
   private static final aqh a = new aqh(Map.of());
   private final Map<ara<?>, ?> b;

   private aqh(Map<ara<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(ara<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aqh a() {
      return a;
   }

   public static <T> aqh a(ara<T> $$0, T $$1) {
      return new aqh(Map.of($$0, $$1));
   }

   public static <T1, T2> aqh a(ara<T1> $$0, T1 $$1, ara<T2> $$2, T2 $$3) {
      return new aqh(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
