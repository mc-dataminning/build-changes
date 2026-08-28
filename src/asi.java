import java.util.Map;

public class asi {
   private static final asi a = new asi(Map.of());
   private final Map<atd<?>, ?> b;

   private asi(Map<atd<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(atd<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static asi a() {
      return a;
   }

   public static <T> asi a(atd<T> $$0, T $$1) {
      return new asi(Map.of($$0, $$1));
   }

   public static <T1, T2> asi a(atd<T1> $$0, T1 $$1, atd<T2> $$2, T2 $$3) {
      return new asi(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
