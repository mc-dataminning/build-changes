import java.util.Optional;

public interface agk<T> {
   void a(ug var1, T var2);

   T a(ug var1);

   default agj<T> a(int $$0) {
      return new agj<>($$0, this);
   }

   T a(T var1);

   static <T> agk<T> a(final ug.b<T> $$0, final ug.a<T> $$1) {
      return new agk.a<T>() {
         @Override
         public void a(ug $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(ug $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> agk<Optional<T>> b(ug.b<T> $$0, ug.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> agk<T> a(Class<T> $$0) {
      return a(ug::a, $$1 -> $$1.b($$0));
   }

   static <T> agk<T> a(im<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends agk<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
