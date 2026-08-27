import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cep {
   cep a = new cep() {
      @Override
      public <T> Optional<T> a(BiFunction<cpm, gu, T> $$0) {
         return Optional.empty();
      }
   };

   static cep a(final cpm $$0, final gu $$1) {
      return new cep() {
         @Override
         public <T> Optional<T> a(BiFunction<cpm, gu, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cpm, gu, T> var1);

   default <T> T a(BiFunction<cpm, gu, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cpm, gu> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
