import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface ctp {
   ctp a = new ctp() {
      @Override
      public <T> Optional<T> a(BiFunction<dhi, jh, T> $$0) {
         return Optional.empty();
      }
   };

   static ctp a(final dhi $$0, final jh $$1) {
      return new ctp() {
         @Override
         public <T> Optional<T> a(BiFunction<dhi, jh, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dhi, jh, T> var1);

   default <T> T a(BiFunction<dhi, jh, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dhi, jh> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
