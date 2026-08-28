import java.util.Map;

public class ath {
   private static final ath a = new ath(Map.of());
   private final Map<auc<?>, ?> b;

   private ath(Map<auc<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(auc<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ath a() {
      return a;
   }

   public static <T> ath a(auc<T> $$0, T $$1) {
      return new ath(Map.of($$0, $$1));
   }

   public static <T1, T2> ath a(auc<T1> $$0, T1 $$1, auc<T2> $$2, T2 $$3) {
      return new ath(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
