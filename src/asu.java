import java.util.Map;

public class asu {
   private static final asu a = new asu(Map.of());
   private final Map<atp<?>, ?> b;

   private asu(Map<atp<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(atp<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static asu a() {
      return a;
   }

   public static <T> asu a(atp<T> $$0, T $$1) {
      return new asu(Map.of($$0, $$1));
   }

   public static <T1, T2> asu a(atp<T1> $$0, T1 $$1, atp<T2> $$2, T2 $$3) {
      return new asu(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
