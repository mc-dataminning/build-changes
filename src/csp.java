import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface csp {
   csp a = new csp() {
      @Override
      public <T> Optional<T> a(BiFunction<dgi, ji, T> $$0) {
         return Optional.empty();
      }
   };

   static csp a(final dgi $$0, final ji $$1) {
      return new csp() {
         @Override
         public <T> Optional<T> a(BiFunction<dgi, ji, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dgi, ji, T> var1);

   default <T> T a(BiFunction<dgi, ji, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dgi, ji> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
