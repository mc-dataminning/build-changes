public class bgz<T> {
   private final bgy a;
   private final T b;

   public bgz(bgy $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bgy a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bgz<T> a(T $$0) {
      return new bgz<>(bgy.a, $$0);
   }

   public static <T> bgz<T> b(T $$0) {
      return new bgz<>(bgy.b, $$0);
   }

   public static <T> bgz<T> c(T $$0) {
      return new bgz<>(bgy.d, $$0);
   }

   public static <T> bgz<T> d(T $$0) {
      return new bgz<>(bgy.e, $$0);
   }

   public static <T> bgz<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
