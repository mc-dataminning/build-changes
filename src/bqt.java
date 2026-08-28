public class bqt<T> {
   private final bqs a;
   private final T b;

   public bqt(bqs $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqs a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqt<T> a(T $$0) {
      return new bqt<>(bqs.a, $$0);
   }

   public static <T> bqt<T> b(T $$0) {
      return new bqt<>(bqs.c, $$0);
   }

   public static <T> bqt<T> c(T $$0) {
      return new bqt<>(bqs.e, $$0);
   }

   public static <T> bqt<T> d(T $$0) {
      return new bqt<>(bqs.f, $$0);
   }

   public static <T> bqt<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
