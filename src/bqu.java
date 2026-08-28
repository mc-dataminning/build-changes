public class bqu<T> {
   private final bqt a;
   private final T b;

   public bqu(bqt $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bqt a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bqu<T> a(T $$0) {
      return new bqu<>(bqt.a, $$0);
   }

   public static <T> bqu<T> b(T $$0) {
      return new bqu<>(bqt.c, $$0);
   }

   public static <T> bqu<T> c(T $$0) {
      return new bqu<>(bqt.e, $$0);
   }

   public static <T> bqu<T> d(T $$0) {
      return new bqu<>(bqt.f, $$0);
   }

   public static <T> bqu<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
