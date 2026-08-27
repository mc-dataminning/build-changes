import java.util.Optional;

public interface aeg<T> {
   void a(sp var1, T var2);

   T a(sp var1);

   default aef<T> a(int $$0) {
      return new aef<>($$0, this);
   }

   T a(T var1);

   static <T> aeg<T> a(final sp.b<T> $$0, final sp.a<T> $$1) {
      return new aeg.a<T>() {
         @Override
         public void a(sp $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(sp $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> aeg<Optional<T>> b(sp.b<T> $$0, sp.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> aeg<T> a(Class<T> $$0) {
      return a(sp::a, $$1 -> $$1.b($$0));
   }

   static <T> aeg<T> a(hl<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends aeg<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
