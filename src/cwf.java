import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cwf {
   cwf a = new cwf() {
      @Override
      public <T> Optional<T> a(BiFunction<djz, iw, T> $$0) {
         return Optional.empty();
      }
   };

   static cwf a(final djz $$0, final iw $$1) {
      return new cwf() {
         @Override
         public <T> Optional<T> a(BiFunction<djz, iw, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<djz, iw, T> var1);

   default <T> T a(BiFunction<djz, iw, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<djz, iw> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
