import java.util.Map;

public class aoq {
   private static final aoq a = new aoq(Map.of());
   private final Map<apj<?>, ?> b;

   private aoq(Map<apj<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(apj<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aoq a() {
      return a;
   }

   public static <T> aoq a(apj<T> $$0, T $$1) {
      return new aoq(Map.of($$0, $$1));
   }

   public static <T1, T2> aoq a(apj<T1> $$0, T1 $$1, apj<T2> $$2, T2 $$3) {
      return new aoq(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
