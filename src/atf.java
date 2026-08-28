import java.util.Map;

public class atf {
   private static final atf a = new atf(Map.of());
   private final Map<aua<?>, ?> b;

   private atf(Map<aua<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aua<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static atf a() {
      return a;
   }

   public static <T> atf a(aua<T> $$0, T $$1) {
      return new atf(Map.of($$0, $$1));
   }

   public static <T1, T2> atf a(aua<T1> $$0, T1 $$1, aua<T2> $$2, T2 $$3) {
      return new atf(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
