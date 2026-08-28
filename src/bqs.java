public class bqs<T> {
   private final bqr a;
   private final T b;

   public bqs(bqr $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqr a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqs<T> a(T $$0) {
      return new bqs<>(bqr.a, $$0);
   }

   public static <T> bqs<T> b(T $$0) {
      return new bqs<>(bqr.c, $$0);
   }

   public static <T> bqs<T> c(T $$0) {
      return new bqs<>(bqr.e, $$0);
   }

   public static <T> bqs<T> d(T $$0) {
      return new bqs<>(bqr.f, $$0);
   }

   public static <T> bqs<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
