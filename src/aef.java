import java.util.Optional;

public interface aef<T> {
   void a(so var1, T var2);

   T a(so var1);

   default aee<T> a(int $$0) {
      return new aee<>($$0, this);
   }

   T a(T var1);

   static <T> aef<T> a(final so.b<T> $$0, final so.a<T> $$1) {
      return new aef.a<T>() {
         @Override
         public void a(so $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(so $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> aef<Optional<T>> b(so.b<T> $$0, so.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> aef<T> a(Class<T> $$0) {
      return a(so::a, $$1 -> $$1.b($$0));
   }

   static <T> aef<T> a(hj<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends aef<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
