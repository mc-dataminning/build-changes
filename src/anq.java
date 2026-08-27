import java.util.Map;

public class anq {
   private static final anq a = new anq(Map.of());
   private final Map<aoh<?>, ?> b;

   private anq(Map<aoh<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aoh<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static anq a() {
      return a;
   }

   public static <T> anq a(aoh<T> $$0, T $$1) {
      return new anq(Map.of($$0, $$1));
   }

   public static <T1, T2> anq a(aoh<T1> $$0, T1 $$1, aoh<T2> $$2, T2 $$3) {
      return new anq(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
