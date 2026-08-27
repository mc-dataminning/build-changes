import java.util.Map;

public class ars {
   private static final ars a = new ars(Map.of());
   private final Map<asn<?>, ?> b;

   private ars(Map<asn<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(asn<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ars a() {
      return a;
   }

   public static <T> ars a(asn<T> $$0, T $$1) {
      return new ars(Map.of($$0, $$1));
   }

   public static <T1, T2> ars a(asn<T1> $$0, T1 $$1, asn<T2> $$2, T2 $$3) {
      return new ars(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
