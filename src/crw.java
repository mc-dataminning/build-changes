import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface crw {
   crw a = new crw() {
      @Override
      public <T> Optional<T> a(BiFunction<dev, jg, T> $$0) {
         return Optional.empty();
      }
   };

   static crw a(final dev $$0, final jg $$1) {
      return new crw() {
         @Override
         public <T> Optional<T> a(BiFunction<dev, jg, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dev, jg, T> var1);

   default <T> T a(BiFunction<dev, jg, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dev, jg> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
