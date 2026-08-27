import java.util.Map;

public class arv {
   private static final arv a = new arv(Map.of());
   private final Map<asq<?>, ?> b;

   private arv(Map<asq<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(asq<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static arv a() {
      return a;
   }

   public static <T> arv a(asq<T> $$0, T $$1) {
      return new arv(Map.of($$0, $$1));
   }

   public static <T1, T2> arv a(asq<T1> $$0, T1 $$1, asq<T2> $$2, T2 $$3) {
      return new arv(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
