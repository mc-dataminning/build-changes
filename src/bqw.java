public class bqw<T> {
   private final bqv a;
   private final T b;

   public bqw(bqv $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqv a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqw<T> a(T $$0) {
      return new bqw<>(bqv.a, $$0);
   }

   public static <T> bqw<T> b(T $$0) {
      return new bqw<>(bqv.c, $$0);
   }

   public static <T> bqw<T> c(T $$0) {
      return new bqw<>(bqv.e, $$0);
   }

   public static <T> bqw<T> d(T $$0) {
      return new bqw<>(bqv.f, $$0);
   }

   public static <T> bqw<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
