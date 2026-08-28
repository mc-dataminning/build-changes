import java.util.Map;

public class atj {
   private static final atj a = new atj(Map.of());
   private final Map<aue<?>, ?> b;

   private atj(Map<aue<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aue<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static atj a() {
      return a;
   }

   public static <T> atj a(aue<T> $$0, T $$1) {
      return new atj(Map.of($$0, $$1));
   }

   public static <T1, T2> atj a(aue<T1> $$0, T1 $$1, aue<T2> $$2, T2 $$3) {
      return new atj(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
