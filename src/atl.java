import java.util.Map;

public class atl {
   private static final atl a = new atl(Map.of());
   private final Map<aug<?>, ?> b;

   private atl(Map<aug<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aug<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static atl a() {
      return a;
   }

   public static <T> atl a(aug<T> $$0, T $$1) {
      return new atl(Map.of($$0, $$1));
   }

   public static <T1, T2> atl a(aug<T1> $$0, T1 $$1, aug<T2> $$2, T2 $$3) {
      return new atl(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
