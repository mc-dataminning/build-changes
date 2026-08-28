import java.util.Map;

public class asp {
   private static final asp a = new asp(Map.of());
   private final Map<atk<?>, ?> b;

   private asp(Map<atk<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(atk<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static asp a() {
      return a;
   }

   public static <T> asp a(atk<T> $$0, T $$1) {
      return new asp(Map.of($$0, $$1));
   }

   public static <T1, T2> asp a(atk<T1> $$0, T1 $$1, atk<T2> $$2, T2 $$3) {
      return new asp(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
