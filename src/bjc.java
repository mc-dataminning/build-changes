public class bjc<T> {
   private final bjb a;
   private final T b;

   public bjc(bjb $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bjb a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bjc<T> a(T $$0) {
      return new bjc<>(bjb.a, $$0);
   }

   public static <T> bjc<T> b(T $$0) {
      return new bjc<>(bjb.b, $$0);
   }

   public static <T> bjc<T> c(T $$0) {
      return new bjc<>(bjb.d, $$0);
   }

   public static <T> bjc<T> d(T $$0) {
      return new bjc<>(bjb.e, $$0);
   }

   public static <T> bjc<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
