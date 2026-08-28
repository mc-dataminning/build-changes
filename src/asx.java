import java.util.Map;

public class asx {
   private static final asx a = new asx(Map.of());
   private final Map<ats<?>, ?> b;

   private asx(Map<ats<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(ats<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static asx a() {
      return a;
   }

   public static <T> asx a(ats<T> $$0, T $$1) {
      return new asx(Map.of($$0, $$1));
   }

   public static <T1, T2> asx a(ats<T1> $$0, T1 $$1, ats<T2> $$2, T2 $$3) {
      return new asx(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
