import java.util.Optional;

public interface ago<T> {
   void a(uj var1, T var2);

   T a(uj var1);

   default agn<T> a(int $$0) {
      return new agn<>($$0, this);
   }

   T a(T var1);

   static <T> ago<T> a(final uj.b<T> $$0, final uj.a<T> $$1) {
      return new ago.a<T>() {
         @Override
         public void a(uj $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(uj $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> ago<Optional<T>> b(uj.b<T> $$0, uj.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> ago<T> a(Class<T> $$0) {
      return a(uj::a, $$1 -> $$1.b($$0));
   }

   static <T> ago<T> a(im<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends ago<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
