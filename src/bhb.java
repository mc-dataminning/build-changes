public class bhb<T> {
   private final bha a;
   private final T b;

   public bhb(bha $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bha a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bhb<T> a(T $$0) {
      return new bhb<>(bha.a, $$0);
   }

   public static <T> bhb<T> b(T $$0) {
      return new bhb<>(bha.b, $$0);
   }

   public static <T> bhb<T> c(T $$0) {
      return new bhb<>(bha.d, $$0);
   }

   public static <T> bhb<T> d(T $$0) {
      return new bhb<>(bha.e, $$0);
   }

   public static <T> bhb<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
