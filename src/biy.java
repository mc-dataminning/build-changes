public class biy<T> {
   private final bix a;
   private final T b;

   public biy(bix $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bix a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> biy<T> a(T $$0) {
      return new biy<>(bix.a, $$0);
   }

   public static <T> biy<T> b(T $$0) {
      return new biy<>(bix.b, $$0);
   }

   public static <T> biy<T> c(T $$0) {
      return new biy<>(bix.d, $$0);
   }

   public static <T> biy<T> d(T $$0) {
      return new biy<>(bix.e, $$0);
   }

   public static <T> biy<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
