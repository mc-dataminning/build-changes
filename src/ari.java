import java.util.Map;

public class ari {
   private static final ari a = new ari(Map.of());
   private final Map<asd<?>, ?> b;

   private ari(Map<asd<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(asd<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ari a() {
      return a;
   }

   public static <T> ari a(asd<T> $$0, T $$1) {
      return new ari(Map.of($$0, $$1));
   }

   public static <T1, T2> ari a(asd<T1> $$0, T1 $$1, asd<T2> $$2, T2 $$3) {
      return new ari(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
