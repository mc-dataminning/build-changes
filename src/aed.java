import java.util.Optional;

public interface aed<T> {
   void a(sl var1, T var2);

   T a(sl var1);

   default aec<T> a(int $$0) {
      return new aec<>($$0, this);
   }

   T a(T var1);

   static <T> aed<T> a(final sl.b<T> $$0, final sl.a<T> $$1) {
      return new aed.a<T>() {
         @Override
         public void a(sl $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(sl $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> aed<Optional<T>> b(sl.b<T> $$0, sl.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> aed<T> a(Class<T> $$0) {
      return a(sl::a, $$1 -> $$1.b($$0));
   }

   static <T> aed<T> a(hl<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends aed<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
