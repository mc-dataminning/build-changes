public class bkd<T> {
   private final bkc a;
   private final T b;

   public bkd(bkc $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bkc a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bkd<T> a(T $$0) {
      return new bkd<>(bkc.a, $$0);
   }

   public static <T> bkd<T> b(T $$0) {
      return new bkd<>(bkc.b, $$0);
   }

   public static <T> bkd<T> c(T $$0) {
      return new bkd<>(bkc.d, $$0);
   }

   public static <T> bkd<T> d(T $$0) {
      return new bkd<>(bkc.e, $$0);
   }

   public static <T> bkd<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
