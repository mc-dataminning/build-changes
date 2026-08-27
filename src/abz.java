import java.util.Optional;

public interface abz<T> {
   void a(sf var1, T var2);

   T a(sf var1);

   default aby<T> a(int $$0) {
      return new aby<>($$0, this);
   }

   T a(T var1);

   static <T> abz<T> a(final sf.b<T> $$0, final sf.a<T> $$1) {
      return new abz.a<T>() {
         @Override
         public void a(sf $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(sf $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> abz<Optional<T>> b(sf.b<T> $$0, sf.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> abz<T> a(Class<T> $$0) {
      return a(sf::a, $$1 -> $$1.b($$0));
   }

   static <T> abz<T> a(hj<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends abz<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
