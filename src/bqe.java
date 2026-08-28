public class bqe<T> {
   private final bqd a;
   private final T b;

   public bqe(bqd $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqd a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqe<T> a(T $$0) {
      return new bqe<>(bqd.a, $$0);
   }

   public static <T> bqe<T> b(T $$0) {
      return new bqe<>(bqd.c, $$0);
   }

   public static <T> bqe<T> c(T $$0) {
      return new bqe<>(bqd.e, $$0);
   }

   public static <T> bqe<T> d(T $$0) {
      return new bqe<>(bqd.f, $$0);
   }

   public static <T> bqe<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
