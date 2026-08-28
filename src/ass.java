import java.util.Map;

public class ass {
   private static final ass a = new ass(Map.of());
   private final Map<atn<?>, ?> b;

   private ass(Map<atn<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(atn<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ass a() {
      return a;
   }

   public static <T> ass a(atn<T> $$0, T $$1) {
      return new ass(Map.of($$0, $$1));
   }

   public static <T1, T2> ass a(atn<T1> $$0, T1 $$1, atn<T2> $$2, T2 $$3) {
      return new ass(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
