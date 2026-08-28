public class bqx<T> {
   private final bqw a;
   private final T b;

   public bqx(bqw $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqw a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqx<T> a(T $$0) {
      return new bqx<>(bqw.a, $$0);
   }

   public static <T> bqx<T> b(T $$0) {
      return new bqx<>(bqw.c, $$0);
   }

   public static <T> bqx<T> c(T $$0) {
      return new bqx<>(bqw.e, $$0);
   }

   public static <T> bqx<T> d(T $$0) {
      return new bqx<>(bqw.f, $$0);
   }

   public static <T> bqx<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
