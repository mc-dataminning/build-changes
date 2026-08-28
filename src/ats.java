import java.util.Map;

public class ats {
   private static final ats a = new ats(Map.of());
   private final Map<aun<?>, ?> b;

   private ats(Map<aun<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aun<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static ats a() {
      return a;
   }

   public static <T> ats a(aun<T> $$0, T $$1) {
      return new ats(Map.of($$0, $$1));
   }

   public static <T1, T2> ats a(aun<T1> $$0, T1 $$1, aun<T2> $$2, T2 $$3) {
      return new ats(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
