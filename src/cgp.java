import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cgp {
   cgp a = new cgp() {
      @Override
      public <T> Optional<T> a(BiFunction<crs, ht, T> $$0) {
         return Optional.empty();
      }
   };

   static cgp a(final crs $$0, final ht $$1) {
      return new cgp() {
         @Override
         public <T> Optional<T> a(BiFunction<crs, ht, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<crs, ht, T> var1);

   default <T> T a(BiFunction<crs, ht, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<crs, ht> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
