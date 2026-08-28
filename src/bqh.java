public class bqh<T> {
   private final bqg a;
   private final T b;

   public bqh(bqg $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqg a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqh<T> a(T $$0) {
      return new bqh<>(bqg.a, $$0);
   }

   public static <T> bqh<T> b(T $$0) {
      return new bqh<>(bqg.c, $$0);
   }

   public static <T> bqh<T> c(T $$0) {
      return new bqh<>(bqg.e, $$0);
   }

   public static <T> bqh<T> d(T $$0) {
      return new bqh<>(bqg.f, $$0);
   }

   public static <T> bqh<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
