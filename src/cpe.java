import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cpe {
   cpe a = new cpe() {
      @Override
      public <T> Optional<T> a(BiFunction<dax, io, T> $$0) {
         return Optional.empty();
      }
   };

   static cpe a(final dax $$0, final io $$1) {
      return new cpe() {
         @Override
         public <T> Optional<T> a(BiFunction<dax, io, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dax, io, T> var1);

   default <T> T a(BiFunction<dax, io, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dax, io> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
