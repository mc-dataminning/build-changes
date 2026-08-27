public class blv<T> {
   private final blu a;
   private final T b;

   public blv(blu $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public blu a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> blv<T> a(T $$0) {
      return new blv<>(blu.a, $$0);
   }

   public static <T> blv<T> b(T $$0) {
      return new blv<>(blu.b, $$0);
   }

   public static <T> blv<T> c(T $$0) {
      return new blv<>(blu.d, $$0);
   }

   public static <T> blv<T> d(T $$0) {
      return new blv<>(blu.e, $$0);
   }

   public static <T> blv<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
