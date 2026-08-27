public class bmm<T> {
   private final bml a;
   private final T b;

   public bmm(bml $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public bml a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bmm<T> a(T $$0) {
      return new bmm<>(bml.a, $$0);
   }

   public static <T> bmm<T> b(T $$0) {
      return new bmm<>(bml.b, $$0);
   }

   public static <T> bmm<T> c(T $$0) {
      return new bmm<>(bml.d, $$0);
   }

   public static <T> bmm<T> d(T $$0) {
      return new bmm<>(bml.e, $$0);
   }

   public static <T> bmm<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
