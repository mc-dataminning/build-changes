public class bpv<T> {
   private final bpu a;
   private final T b;

   public bpv(bpu $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bpu a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bpv<T> a(T $$0) {
      return new bpv<>(bpu.a, $$0);
   }

   public static <T> bpv<T> b(T $$0) {
      return new bpv<>(bpu.b, $$0);
   }

   public static <T> bpv<T> c(T $$0) {
      return new bpv<>(bpu.d, $$0);
   }

   public static <T> bpv<T> d(T $$0) {
      return new bpv<>(bpu.e, $$0);
   }

   public static <T> bpv<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
