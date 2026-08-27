public class bjw<T> {
   private final bjv a;
   private final T b;

   public bjw(bjv $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bjv a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bjw<T> a(T $$0) {
      return new bjw<>(bjv.a, $$0);
   }

   public static <T> bjw<T> b(T $$0) {
      return new bjw<>(bjv.b, $$0);
   }

   public static <T> bjw<T> c(T $$0) {
      return new bjw<>(bjv.d, $$0);
   }

   public static <T> bjw<T> d(T $$0) {
      return new bjw<>(bjv.e, $$0);
   }

   public static <T> bjw<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
