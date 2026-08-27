public class bor<T> {
   private final boq a;
   private final T b;

   public bor(boq $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boq a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bor<T> a(T $$0) {
      return new bor<>(boq.a, $$0);
   }

   public static <T> bor<T> b(T $$0) {
      return new bor<>(boq.b, $$0);
   }

   public static <T> bor<T> c(T $$0) {
      return new bor<>(boq.d, $$0);
   }

   public static <T> bor<T> d(T $$0) {
      return new bor<>(boq.e, $$0);
   }

   public static <T> bor<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
