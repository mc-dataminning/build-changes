import java.util.Map;

public class alv {
   private static final alv a = new alv(Map.of());
   private final Map<amm<?>, ?> b;

   private alv(Map<amm<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(amm<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static alv a() {
      return a;
   }

   public static <T> alv a(amm<T> $$0, T $$1) {
      return new alv(Map.of($$0, $$1));
   }

   public static <T1, T2> alv a(amm<T1> $$0, T1 $$1, amm<T2> $$2, T2 $$3) {
      return new alv(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
