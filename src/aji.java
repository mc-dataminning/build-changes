import java.util.Map;

public class aji {
   private static final aji a = new aji(Map.of());
   private final Map<ajx<?>, ?> b;

   private aji(Map<ajx<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(ajx<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aji a() {
      return a;
   }

   public static <T> aji a(ajx<T> $$0, T $$1) {
      return new aji(Map.of($$0, $$1));
   }

   public static <T1, T2> aji a(ajx<T1> $$0, T1 $$1, ajx<T2> $$2, T2 $$3) {
      return new aji(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
