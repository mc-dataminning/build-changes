import java.util.Map;

public class anm {
   private static final anm a = new anm(Map.of());
   private final Map<aod<?>, ?> b;

   private anm(Map<aod<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aod<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static anm a() {
      return a;
   }

   public static <T> anm a(aod<T> $$0, T $$1) {
      return new anm(Map.of($$0, $$1));
   }

   public static <T1, T2> anm a(aod<T1> $$0, T1 $$1, aod<T2> $$2, T2 $$3) {
      return new anm(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
