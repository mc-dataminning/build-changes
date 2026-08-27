public class blx<T> {
   private final blw a;
   private final T b;

   public blx(blw $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public blw a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> blx<T> a(T $$0) {
      return new blx<>(blw.a, $$0);
   }

   public static <T> blx<T> b(T $$0) {
      return new blx<>(blw.b, $$0);
   }

   public static <T> blx<T> c(T $$0) {
      return new blx<>(blw.d, $$0);
   }

   public static <T> blx<T> d(T $$0) {
      return new blx<>(blw.e, $$0);
   }

   public static <T> blx<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
