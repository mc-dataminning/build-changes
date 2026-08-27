import java.util.Map;

public class aly {
   private static final aly a = new aly(Map.of());
   private final Map<amp<?>, ?> b;

   private aly(Map<amp<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(amp<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aly a() {
      return a;
   }

   public static <T> aly a(amp<T> $$0, T $$1) {
      return new aly(Map.of($$0, $$1));
   }

   public static <T1, T2> aly a(amp<T1> $$0, T1 $$1, amp<T2> $$2, T2 $$3) {
      return new aly(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
