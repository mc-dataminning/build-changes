public class bqr<T> {
   private final bqq a;
   private final T b;

   public bqr(bqq $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqq a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqr<T> a(T $$0) {
      return new bqr<>(bqq.a, $$0);
   }

   public static <T> bqr<T> b(T $$0) {
      return new bqr<>(bqq.c, $$0);
   }

   public static <T> bqr<T> c(T $$0) {
      return new bqr<>(bqq.e, $$0);
   }

   public static <T> bqr<T> d(T $$0) {
      return new bqr<>(bqq.f, $$0);
   }

   public static <T> bqr<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
