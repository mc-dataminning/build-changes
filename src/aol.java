import java.util.Map;

public class aol {
   private static final aol a = new aol(Map.of());
   private final Map<apc<?>, ?> b;

   private aol(Map<apc<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(apc<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aol a() {
      return a;
   }

   public static <T> aol a(apc<T> $$0, T $$1) {
      return new aol(Map.of($$0, $$1));
   }

   public static <T1, T2> aol a(apc<T1> $$0, T1 $$1, apc<T2> $$2, T2 $$3) {
      return new aol(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
