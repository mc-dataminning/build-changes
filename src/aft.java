import java.util.Optional;

public interface aft<T> {
   void a(ty var1, T var2);

   T a(ty var1);

   default afs<T> a(int $$0) {
      return new afs<>($$0, this);
   }

   T a(T var1);

   static <T> aft<T> a(final ty.b<T> $$0, final ty.a<T> $$1) {
      return new aft.a<T>() {
         @Override
         public void a(ty $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(ty $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> aft<Optional<T>> b(ty.b<T> $$0, ty.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> aft<T> a(Class<T> $$0) {
      return a(ty::a, $$1 -> $$1.b($$0));
   }

   static <T> aft<T> a(il<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends aft<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
