import java.util.Map;

public class asw {
   private static final asw a = new asw(Map.of());
   private final Map<atr<?>, ?> b;

   private asw(Map<atr<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(atr<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static asw a() {
      return a;
   }

   public static <T> asw a(atr<T> $$0, T $$1) {
      return new asw(Map.of($$0, $$1));
   }

   public static <T1, T2> asw a(atr<T1> $$0, T1 $$1, atr<T2> $$2, T2 $$3) {
      return new asw(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
