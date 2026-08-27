import java.util.Optional;

public interface aeh<T> {
   void a(sq var1, T var2);

   T a(sq var1);

   default aeg<T> a(int $$0) {
      return new aeg<>($$0, this);
   }

   T a(T var1);

   static <T> aeh<T> a(final sq.b<T> $$0, final sq.a<T> $$1) {
      return new aeh.a<T>() {
         @Override
         public void a(sq $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(sq $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> aeh<Optional<T>> b(sq.b<T> $$0, sq.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> aeh<T> a(Class<T> $$0) {
      return a(sq::a, $$1 -> $$1.b($$0));
   }

   static <T> aeh<T> a(hl<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends aeh<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
