public class bqb<T> {
   private final bqa a;
   private final T b;

   public bqb(bqa $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqa a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqb<T> a(T $$0) {
      return new bqb<>(bqa.a, $$0);
   }

   public static <T> bqb<T> b(T $$0) {
      return new bqb<>(bqa.b, $$0);
   }

   public static <T> bqb<T> c(T $$0) {
      return new bqb<>(bqa.d, $$0);
   }

   public static <T> bqb<T> d(T $$0) {
      return new bqb<>(bqa.e, $$0);
   }

   public static <T> bqb<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
