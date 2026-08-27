import java.util.Optional;

public interface ady<T> {
   void a(sh var1, T var2);

   T a(sh var1);

   default adx<T> a(int $$0) {
      return new adx<>($$0, this);
   }

   T a(T var1);

   static <T> ady<T> a(final sh.b<T> $$0, final sh.a<T> $$1) {
      return new ady.a<T>() {
         @Override
         public void a(sh $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(sh $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> ady<Optional<T>> b(sh.b<T> $$0, sh.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> ady<T> a(Class<T> $$0) {
      return a(sh::a, $$1 -> $$1.b($$0));
   }

   static <T> ady<T> a(hk<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends ady<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
