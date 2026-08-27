import java.util.Map;

public class alt {
   private static final alt a = new alt(Map.of());
   private final Map<amk<?>, ?> b;

   private alt(Map<amk<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(amk<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static alt a() {
      return a;
   }

   public static <T> alt a(amk<T> $$0, T $$1) {
      return new alt(Map.of($$0, $$1));
   }

   public static <T1, T2> alt a(amk<T1> $$0, T1 $$1, amk<T2> $$2, T2 $$3) {
      return new alt(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
