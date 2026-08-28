import java.util.Map;

public class ate {
   private static final ate a = new ate(Map.of());
   private final Map<atz<?>, ?> b;

   private ate(Map<atz<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(atz<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ate a() {
      return a;
   }

   public static <T> ate a(atz<T> $$0, T $$1) {
      return new ate(Map.of($$0, $$1));
   }

   public static <T1, T2> ate a(atz<T1> $$0, T1 $$1, atz<T2> $$2, T2 $$3) {
      return new ate(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
