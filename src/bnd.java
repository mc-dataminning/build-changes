public class bnd<T> {
   private final bnc a;
   private final T b;

   public bnd(bnc $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bnc a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bnd<T> a(T $$0) {
      return new bnd<>(bnc.a, $$0);
   }

   public static <T> bnd<T> b(T $$0) {
      return new bnd<>(bnc.b, $$0);
   }

   public static <T> bnd<T> c(T $$0) {
      return new bnd<>(bnc.d, $$0);
   }

   public static <T> bnd<T> d(T $$0) {
      return new bnd<>(bnc.e, $$0);
   }

   public static <T> bnd<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
