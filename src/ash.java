import java.util.Map;

public class ash {
   private static final ash a = new ash(Map.of());
   private final Map<atc<?>, ?> b;

   private ash(Map<atc<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(atc<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ash a() {
      return a;
   }

   public static <T> ash a(atc<T> $$0, T $$1) {
      return new ash(Map.of($$0, $$1));
   }

   public static <T1, T2> ash a(atc<T1> $$0, T1 $$1, atc<T2> $$2, T2 $$3) {
      return new ash(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
