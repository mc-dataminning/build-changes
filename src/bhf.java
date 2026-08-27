public class bhf<T> {
   private final bhe a;
   private final T b;

   public bhf(bhe $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bhe a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bhf<T> a(T $$0) {
      return new bhf<>(bhe.a, $$0);
   }

   public static <T> bhf<T> b(T $$0) {
      return new bhf<>(bhe.b, $$0);
   }

   public static <T> bhf<T> c(T $$0) {
      return new bhf<>(bhe.d, $$0);
   }

   public static <T> bhf<T> d(T $$0) {
      return new bhf<>(bhe.e, $$0);
   }

   public static <T> bhf<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
