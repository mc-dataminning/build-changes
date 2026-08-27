public class bpn<T> {
   private final bpm a;
   private final T b;

   public bpn(bpm $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bpm a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bpn<T> a(T $$0) {
      return new bpn<>(bpm.a, $$0);
   }

   public static <T> bpn<T> b(T $$0) {
      return new bpn<>(bpm.b, $$0);
   }

   public static <T> bpn<T> c(T $$0) {
      return new bpn<>(bpm.d, $$0);
   }

   public static <T> bpn<T> d(T $$0) {
      return new bpn<>(bpm.e, $$0);
   }

   public static <T> bpn<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
