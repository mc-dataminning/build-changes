import java.util.Map;

public class anc {
   private static final anc a = new anc(Map.of());
   private final Map<ant<?>, ?> b;

   private anc(Map<ant<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(ant<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static anc a() {
      return a;
   }

   public static <T> anc a(ant<T> $$0, T $$1) {
      return new anc(Map.of($$0, $$1));
   }

   public static <T1, T2> anc a(ant<T1> $$0, T1 $$1, ant<T2> $$2, T2 $$3) {
      return new anc(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
