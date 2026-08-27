import java.util.Map;

public class aop {
   private static final aop a = new aop(Map.of());
   private final Map<aph<?>, ?> b;

   private aop(Map<aph<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aph<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aop a() {
      return a;
   }

   public static <T> aop a(aph<T> $$0, T $$1) {
      return new aop(Map.of($$0, $$1));
   }

   public static <T1, T2> aop a(aph<T1> $$0, T1 $$1, aph<T2> $$2, T2 $$3) {
      return new aop(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
