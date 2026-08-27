public class bir<T> {
   private final biq a;
   private final T b;

   public bir(biq $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public biq a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bir<T> a(T $$0) {
      return new bir<>(biq.a, $$0);
   }

   public static <T> bir<T> b(T $$0) {
      return new bir<>(biq.b, $$0);
   }

   public static <T> bir<T> c(T $$0) {
      return new bir<>(biq.d, $$0);
   }

   public static <T> bir<T> d(T $$0) {
      return new bir<>(biq.e, $$0);
   }

   public static <T> bir<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
