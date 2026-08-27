import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface ciu {
   ciu a = new ciu() {
      @Override
      public <T> Optional<T> a(BiFunction<ctx, hx, T> $$0) {
         return Optional.empty();
      }
   };

   static ciu a(final ctx $$0, final hx $$1) {
      return new ciu() {
         @Override
         public <T> Optional<T> a(BiFunction<ctx, hx, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<ctx, hx, T> var1);

   default <T> T a(BiFunction<ctx, hx, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<ctx, hx> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
