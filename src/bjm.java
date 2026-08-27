public class bjm<T> {
   private final bjl a;
   private final T b;

   public bjm(bjl $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bjl a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bjm<T> a(T $$0) {
      return new bjm<>(bjl.a, $$0);
   }

   public static <T> bjm<T> b(T $$0) {
      return new bjm<>(bjl.b, $$0);
   }

   public static <T> bjm<T> c(T $$0) {
      return new bjm<>(bjl.d, $$0);
   }

   public static <T> bjm<T> d(T $$0) {
      return new bjm<>(bjl.e, $$0);
   }

   public static <T> bjm<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
