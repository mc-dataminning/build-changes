import java.util.Optional;

public interface afd<T> {
   void a(tl var1, T var2);

   T a(tl var1);

   default afc<T> a(int $$0) {
      return new afc<>($$0, this);
   }

   T a(T var1);

   static <T> afd<T> a(final tl.b<T> $$0, final tl.a<T> $$1) {
      return new afd.a<T>() {
         @Override
         public void a(tl $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(tl $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> afd<Optional<T>> b(tl.b<T> $$0, tl.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> afd<T> a(Class<T> $$0) {
      return a(tl::a, $$1 -> $$1.b($$0));
   }

   static <T> afd<T> a(ih<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends afd<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
