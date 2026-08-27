import java.util.Map;

public class anu {
   private static final anu a = new anu(Map.of());
   private final Map<aol<?>, ?> b;

   private anu(Map<aol<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aol<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static anu a() {
      return a;
   }

   public static <T> anu a(aol<T> $$0, T $$1) {
      return new anu(Map.of($$0, $$1));
   }

   public static <T1, T2> anu a(aol<T1> $$0, T1 $$1, aol<T2> $$2, T2 $$3) {
      return new anu(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
