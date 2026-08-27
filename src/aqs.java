import java.util.Map;

public class aqs {
   private static final aqs a = new aqs(Map.of());
   private final Map<arn<?>, ?> b;

   private aqs(Map<arn<?>, ?> $$0) {
      this.b = $$0;
   }

   public <T> T a(arn<T> $$0) {
      return (T)this.b.get($$0);
   }

   public static aqs a() {
      return a;
   }

   public static <T> aqs a(arn<T> $$0, T $$1) {
      return new aqs(Map.of($$0, $$1));
   }

   public static <T1, T2> aqs a(arn<T1> $$0, T1 $$1, arn<T2> $$2, T2 $$3) {
      return new aqs(Map.of($$0, $$1, $$2, (T1)$$3));
   }
}
