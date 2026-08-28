import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cvi {
   cvi a = new cvi() {
      @Override
      public <T> Optional<T> a(BiFunction<dja, iu, T> $$0) {
         return Optional.empty();
      }
   };

   static cvi a(final dja $$0, final iu $$1) {
      return new cvi() {
         @Override
         public <T> Optional<T> a(BiFunction<dja, iu, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dja, iu, T> var1);

   default <T> T a(BiFunction<dja, iu, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dja, iu> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
