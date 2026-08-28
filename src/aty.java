import java.util.Map;

public class aty {
   private static final aty a = new aty(Map.of());
   private final Map<aut<?>, ?> b;

   private aty(Map<aut<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aut<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aty a() {
      return a;
   }

   public static <T> aty a(aut<T> $$0, T $$1) {
      return new aty(Map.of($$0, $$1));
   }

   public static <T1, T2> aty a(aut<T1> $$0, T1 $$1, aut<T2> $$2, T2 $$3) {
      return new aty(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
