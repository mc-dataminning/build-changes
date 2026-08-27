import java.util.Optional;

public interface aea<T> {
   void a(si var1, T var2);

   T a(si var1);

   default adz<T> a(int $$0) {
      return new adz<>($$0, this);
   }

   T a(T var1);

   static <T> aea<T> a(final si.b<T> $$0, final si.a<T> $$1) {
      return new aea.a<T>() {
         @Override
         public void a(si $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(si $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> aea<Optional<T>> b(si.b<T> $$0, si.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> aea<T> a(Class<T> $$0) {
      return a(si::a, $$1 -> $$1.b($$0));
   }

   static <T> aea<T> a(hj<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends aea<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
