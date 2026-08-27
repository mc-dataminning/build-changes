public class bgr<T> {
   private final bgq a;
   private final T b;

   public bgr(bgq $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bgq a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bgr<T> a(T $$0) {
      return new bgr<>(bgq.a, $$0);
   }

   public static <T> bgr<T> b(T $$0) {
      return new bgr<>(bgq.b, $$0);
   }

   public static <T> bgr<T> c(T $$0) {
      return new bgr<>(bgq.d, $$0);
   }

   public static <T> bgr<T> d(T $$0) {
      return new bgr<>(bgq.e, $$0);
   }

   public static <T> bgr<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
