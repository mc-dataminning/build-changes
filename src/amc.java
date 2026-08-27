import java.util.Map;

public class amc {
   private static final amc a = new amc(Map.of());
   private final Map<amt<?>, ?> b;

   private amc(Map<amt<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(amt<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static amc a() {
      return a;
   }

   public static <T> amc a(amt<T> $$0, T $$1) {
      return new amc(Map.of($$0, $$1));
   }

   public static <T1, T2> amc a(amt<T1> $$0, T1 $$1, amt<T2> $$2, T2 $$3) {
      return new amc(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
