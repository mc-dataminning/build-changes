import java.util.Map;

public class amf {
   private static final amf a = new amf(Map.of());
   private final Map<amw<?>, ?> b;

   private amf(Map<amw<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(amw<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static amf a() {
      return a;
   }

   public static <T> amf a(amw<T> $$0, T $$1) {
      return new amf(Map.of($$0, $$1));
   }

   public static <T1, T2> amf a(amw<T1> $$0, T1 $$1, amw<T2> $$2, T2 $$3) {
      return new amf(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
