import java.util.Map;

public class aob {
   private static final aob a = new aob(Map.of());
   private final Map<aos<?>, ?> b;

   private aob(Map<aos<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aos<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aob a() {
      return a;
   }

   public static <T> aob a(aos<T> $$0, T $$1) {
      return new aob(Map.of($$0, $$1));
   }

   public static <T1, T2> aob a(aos<T1> $$0, T1 $$1, aos<T2> $$2, T2 $$3) {
      return new aob(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
