public class bqv<T> {
   private final bqu a;
   private final T b;

   public bqv(bqu $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqu a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqv<T> a(T $$0) {
      return new bqv<>(bqu.a, $$0);
   }

   public static <T> bqv<T> b(T $$0) {
      return new bqv<>(bqu.c, $$0);
   }

   public static <T> bqv<T> c(T $$0) {
      return new bqv<>(bqu.e, $$0);
   }

   public static <T> bqv<T> d(T $$0) {
      return new bqv<>(bqu.f, $$0);
   }

   public static <T> bqv<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
