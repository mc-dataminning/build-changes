import java.util.Map;

public class asa {
   private static final asa a = new asa(Map.of());
   private final Map<asv<?>, ?> b;

   private asa(Map<asv<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(asv<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static asa a() {
      return a;
   }

   public static <T> asa a(asv<T> $$0, T $$1) {
      return new asa(Map.of($$0, $$1));
   }

   public static <T1, T2> asa a(asv<T1> $$0, T1 $$1, asv<T2> $$2, T2 $$3) {
      return new asa(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
