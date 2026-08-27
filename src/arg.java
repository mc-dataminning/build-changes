import java.util.Map;

public class arg {
   private static final arg a = new arg(Map.of());
   private final Map<asb<?>, ?> b;

   private arg(Map<asb<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(asb<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static arg a() {
      return a;
   }

   public static <T> arg a(asb<T> $$0, T $$1) {
      return new arg(Map.of($$0, $$1));
   }

   public static <T1, T2> arg a(asb<T1> $$0, T1 $$1, asb<T2> $$2, T2 $$3) {
      return new arg(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
