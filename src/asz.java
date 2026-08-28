import java.util.Map;

public class asz {
   private static final asz a = new asz(Map.of());
   private final Map<atu<?>, ?> b;

   private asz(Map<atu<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(atu<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static asz a() {
      return a;
   }

   public static <T> asz a(atu<T> $$0, T $$1) {
      return new asz(Map.of($$0, $$1));
   }

   public static <T1, T2> asz a(atu<T1> $$0, T1 $$1, atu<T2> $$2, T2 $$3) {
      return new asz(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
