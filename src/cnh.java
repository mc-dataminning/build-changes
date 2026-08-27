import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cnh {
   cnh a = new cnh() {
      @Override
      public <T> Optional<T> a(BiFunction<czg, id, T> $$0) {
         return Optional.empty();
      }
   };

   static cnh a(final czg $$0, final id $$1) {
      return new cnh() {
         @Override
         public <T> Optional<T> a(BiFunction<czg, id, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<czg, id, T> var1);

   default <T> T a(BiFunction<czg, id, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<czg, id> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
