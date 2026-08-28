import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface csq {
   csq a = new csq() {
      @Override
      public <T> Optional<T> a(BiFunction<dgj, ji, T> $$0) {
         return Optional.empty();
      }
   };

   static csq a(final dgj $$0, final ji $$1) {
      return new csq() {
         @Override
         public <T> Optional<T> a(BiFunction<dgj, ji, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dgj, ji, T> var1);

   default <T> T a(BiFunction<dgj, ji, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dgj, ji> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
