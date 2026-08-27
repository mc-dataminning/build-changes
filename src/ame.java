import java.util.Map;

public class ame {
   private static final ame a = new ame(Map.of());
   private final Map<amv<?>, ?> b;

   private ame(Map<amv<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(amv<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ame a() {
      return a;
   }

   public static <T> ame a(amv<T> $$0, T $$1) {
      return new ame(Map.of($$0, $$1));
   }

   public static <T1, T2> ame a(amv<T1> $$0, T1 $$1, amv<T2> $$2, T2 $$3) {
      return new ame(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
