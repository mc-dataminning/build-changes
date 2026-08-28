import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cpt {
   cpt a = new cpt() {
      @Override
      public <T> Optional<T> a(BiFunction<dcf, ja, T> $$0) {
         return Optional.empty();
      }
   };

   static cpt a(final dcf $$0, final ja $$1) {
      return new cpt() {
         @Override
         public <T> Optional<T> a(BiFunction<dcf, ja, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dcf, ja, T> var1);

   default <T> T a(BiFunction<dcf, ja, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dcf, ja> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
