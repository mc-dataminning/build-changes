public class bob<T> {
   private final boa a;
   private final T b;

   public bob(boa $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boa a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bob<T> a(T $$0) {
      return new bob<>(boa.a, $$0);
   }

   public static <T> bob<T> b(T $$0) {
      return new bob<>(boa.b, $$0);
   }

   public static <T> bob<T> c(T $$0) {
      return new bob<>(boa.d, $$0);
   }

   public static <T> bob<T> d(T $$0) {
      return new bob<>(boa.e, $$0);
   }

   public static <T> bob<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
