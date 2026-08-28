public class bqq<T> {
   private final bqp a;
   private final T b;

   public bqq(bqp $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqp a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqq<T> a(T $$0) {
      return new bqq<>(bqp.a, $$0);
   }

   public static <T> bqq<T> b(T $$0) {
      return new bqq<>(bqp.c, $$0);
   }

   public static <T> bqq<T> c(T $$0) {
      return new bqq<>(bqp.e, $$0);
   }

   public static <T> bqq<T> d(T $$0) {
      return new bqq<>(bqp.f, $$0);
   }

   public static <T> bqq<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
