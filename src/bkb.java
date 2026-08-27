public class bkb<T> {
   private final bka a;
   private final T b;

   public bkb(bka $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bka a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bkb<T> a(T $$0) {
      return new bkb<>(bka.a, $$0);
   }

   public static <T> bkb<T> b(T $$0) {
      return new bkb<>(bka.b, $$0);
   }

   public static <T> bkb<T> c(T $$0) {
      return new bkb<>(bka.d, $$0);
   }

   public static <T> bkb<T> d(T $$0) {
      return new bkb<>(bka.e, $$0);
   }

   public static <T> bkb<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
