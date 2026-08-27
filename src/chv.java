import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface chv {
   chv a = new chv() {
      @Override
      public <T> Optional<T> a(BiFunction<csy, hv, T> $$0) {
         return Optional.empty();
      }
   };

   static chv a(final csy $$0, final hv $$1) {
      return new chv() {
         @Override
         public <T> Optional<T> a(BiFunction<csy, hv, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<csy, hv, T> var1);

   default <T> T a(BiFunction<csy, hv, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<csy, hv> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
