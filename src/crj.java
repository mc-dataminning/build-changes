import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface crj {
   crj a = new crj() {
      @Override
      public <T> Optional<T> a(BiFunction<deg, je, T> $$0) {
         return Optional.empty();
      }
   };

   static crj a(final deg $$0, final je $$1) {
      return new crj() {
         @Override
         public <T> Optional<T> a(BiFunction<deg, je, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<deg, je, T> var1);

   default <T> T a(BiFunction<deg, je, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<deg, je> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
