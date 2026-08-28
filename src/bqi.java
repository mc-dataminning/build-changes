public class bqi<T> {
   private final bqh a;
   private final T b;

   public bqi(bqh $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqh a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqi<T> a(T $$0) {
      return new bqi<>(bqh.a, $$0);
   }

   public static <T> bqi<T> b(T $$0) {
      return new bqi<>(bqh.c, $$0);
   }

   public static <T> bqi<T> c(T $$0) {
      return new bqi<>(bqh.e, $$0);
   }

   public static <T> bqi<T> d(T $$0) {
      return new bqi<>(bqh.f, $$0);
   }

   public static <T> bqi<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
