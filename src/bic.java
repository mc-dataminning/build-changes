public class bic<T> {
   private final bib a;
   private final T b;

   public bic(bib $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bib a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bic<T> a(T $$0) {
      return new bic<>(bib.a, $$0);
   }

   public static <T> bic<T> b(T $$0) {
      return new bic<>(bib.b, $$0);
   }

   public static <T> bic<T> c(T $$0) {
      return new bic<>(bib.d, $$0);
   }

   public static <T> bic<T> d(T $$0) {
      return new bic<>(bib.e, $$0);
   }

   public static <T> bic<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
