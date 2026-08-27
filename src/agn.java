import java.util.Optional;

public interface agn<T> {
   void a(ui var1, T var2);

   T a(ui var1);

   default agm<T> a(int $$0) {
      return new agm<>($$0, this);
   }

   T a(T var1);

   static <T> agn<T> a(final ui.b<T> $$0, final ui.a<T> $$1) {
      return new agn.a<T>() {
         @Override
         public void a(ui $$0x, T $$1x) {
            $$0.accept($$0, $$1);
         }

         @Override
         public T a(ui $$0x) {
            return $$1.apply($$0);
         }
      };
   }

   static <T> agn<Optional<T>> b(ui.b<T> $$0, ui.a<T> $$1) {
      return a($$0.asOptional(), $$1.asOptional());
   }

   static <T extends Enum<T>> agn<T> a(Class<T> $$0) {
      return a(ui::a, $$1 -> $$1.b($$0));
   }

   static <T> agn<T> a(im<T> $$0) {
      return a(($$1, $$2) -> $$1.a($$0, (T)$$2), $$1 -> $$1.a($$0));
   }

   public interface a<T> extends agn<T> {
      @Override
      default T a(T $$0) {
         return $$0;
      }
   }
}
