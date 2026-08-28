import java.util.Map;

public class atd {
   private static final atd a = new atd(Map.of());
   private final Map<aty<?>, ?> b;

   private atd(Map<aty<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(aty<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static atd a() {
      return a;
   }

   public static <T> atd a(aty<T> $$0, T $$1) {
      return new atd(Map.of($$0, $$1));
   }

   public static <T1, T2> atd a(aty<T1> $$0, T1 $$1, aty<T2> $$2, T2 $$3) {
      return new atd(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
