import java.util.Map;

public class amd {
   private static final amd a = new amd(Map.of());
   private final Map<amu<?>, ?> b;

   private amd(Map<amu<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(amu<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static amd a() {
      return a;
   }

   public static <T> amd a(amu<T> $$0, T $$1) {
      return new amd(Map.of($$0, $$1));
   }

   public static <T1, T2> amd a(amu<T1> $$0, T1 $$1, amu<T2> $$2, T2 $$3) {
      return new amd(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
