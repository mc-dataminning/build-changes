import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cop {
   cop a = new cop() {
      @Override
      public <T> Optional<T> a(BiFunction<dad, in, T> $$0) {
         return Optional.empty();
      }
   };

   static cop a(final dad $$0, final in $$1) {
      return new cop() {
         @Override
         public <T> Optional<T> a(BiFunction<dad, in, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dad, in, T> var1);

   default <T> T a(BiFunction<dad, in, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dad, in> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
