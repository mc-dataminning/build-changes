import java.util.Optional;

public interface afp<T> {
   void a(tu var1, T var2);

   T a(tu var1);

   default afo<T> a(int $$0) {
      return new afo<>($$0, this);
   }

   T a(T var1);

   static <T> afp<T> a(final tu.b<T> $$0, final tu.a<T> $$1) {
      return new afp.a<T>() {
         @Override
         public void a(tu $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(tu $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> afp<Optional<T>> b(tu.b<T> $$0, tu.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> afp<T> a(Class<T> $$0) {
      return a(tu::a, $$1 -> $$1.b($$0));
   }

   static <T> afp<T> a(ih<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends afp<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
