public class bkc<T> {
   private final bkb a;
   private final T b;

   public bkc(bkb $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bkb a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bkc<T> a(T $$0) {
      return new bkc<>(bkb.a, $$0);
   }

   public static <T> bkc<T> b(T $$0) {
      return new bkc<>(bkb.b, $$0);
   }

   public static <T> bkc<T> c(T $$0) {
      return new bkc<>(bkb.d, $$0);
   }

   public static <T> bkc<T> d(T $$0) {
      return new bkc<>(bkb.e, $$0);
   }

   public static <T> bkc<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
