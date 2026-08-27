public class bog<T> {
   private final bof a;
   private final T b;

   public bog(bof $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bof a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bog<T> a(T $$0) {
      return new bog<>(bof.a, $$0);
   }

   public static <T> bog<T> b(T $$0) {
      return new bog<>(bof.b, $$0);
   }

   public static <T> bog<T> c(T $$0) {
      return new bog<>(bof.d, $$0);
   }

   public static <T> bog<T> d(T $$0) {
      return new bog<>(bof.e, $$0);
   }

   public static <T> bog<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
