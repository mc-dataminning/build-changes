import java.util.Map;

public class atg {
   private static final atg a = new atg(Map.of());
   private final Map<aub<?>, ?> b;

   private atg(Map<aub<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aub<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static atg a() {
      return a;
   }

   public static <T> atg a(aub<T> $$0, T $$1) {
      return new atg(Map.of($$0, $$1));
   }

   public static <T1, T2> atg a(aub<T1> $$0, T1 $$1, aub<T2> $$2, T2 $$3) {
      return new atg(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
