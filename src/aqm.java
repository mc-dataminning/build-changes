import java.util.Map;

public class aqm {
   private static final aqm a = new aqm(Map.of());
   private final Map<arf<?>, ?> b;

   private aqm(Map<arf<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(arf<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aqm a() {
      return a;
   }

   public static <T> aqm a(arf<T> $$0, T $$1) {
      return new aqm(Map.of($$0, $$1));
   }

   public static <T1, T2> aqm a(arf<T1> $$0, T1 $$1, arf<T2> $$2, T2 $$3) {
      return new aqm(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
