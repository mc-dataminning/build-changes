import java.util.Optional;

public interface aga<T> {
   void a(ue var1, T var2);

   T a(ue var1);

   default afz<T> a(int $$0) {
      return new afz<>($$0, this);
   }

   T a(T var1);

   static <T> aga<T> a(final ue.b<T> $$0, final ue.a<T> $$1) {
      return new aga.a<T>() {
         @Override
         public void a(ue $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(ue $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> aga<Optional<T>> b(ue.b<T> $$0, ue.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> aga<T> a(Class<T> $$0) {
      return a(ue::a, $$1 -> $$1.b($$0));
   }

   static <T> aga<T> a(ik<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends aga<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
