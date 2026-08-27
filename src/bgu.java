public class bgu<T> {
   private final bgt a;
   private final T b;

   public bgu(bgt $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bgt a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bgu<T> a(T $$0) {
      return new bgu<>(bgt.a, $$0);
   }

   public static <T> bgu<T> b(T $$0) {
      return new bgu<>(bgt.b, $$0);
   }

   public static <T> bgu<T> c(T $$0) {
      return new bgu<>(bgt.d, $$0);
   }

   public static <T> bgu<T> d(T $$0) {
      return new bgu<>(bgt.e, $$0);
   }

   public static <T> bgu<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
