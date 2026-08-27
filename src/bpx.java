public class bpx<T> {
   private final bpw a;
   private final T b;

   public bpx(bpw $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bpw a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bpx<T> a(T $$0) {
      return new bpx<>(bpw.a, $$0);
   }

   public static <T> bpx<T> b(T $$0) {
      return new bpx<>(bpw.b, $$0);
   }

   public static <T> bpx<T> c(T $$0) {
      return new bpx<>(bpw.d, $$0);
   }

   public static <T> bpx<T> d(T $$0) {
      return new bpx<>(bpw.e, $$0);
   }

   public static <T> bpx<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
