import java.util.Map;

public class asb {
   private static final asb a = new asb(Map.of());
   private final Map<asw<?>, ?> b;

   private asb(Map<asw<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(asw<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static asb a() {
      return a;
   }

   public static <T> asb a(asw<T> $$0, T $$1) {
      return new asb(Map.of($$0, $$1));
   }

   public static <T1, T2> asb a(asw<T1> $$0, T1 $$1, asw<T2> $$2, T2 $$3) {
      return new asb(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
