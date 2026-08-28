import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cqd {
   cqd a = new cqd() {
      @Override
      public <T> Optional<T> a(BiFunction<dbw, iz, T> $$0) {
         return Optional.empty();
      }
   };

   static cqd a(final dbw $$0, final iz $$1) {
      return new cqd() {
         @Override
         public <T> Optional<T> a(BiFunction<dbw, iz, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dbw, iz, T> var1);

   default <T> T a(BiFunction<dbw, iz, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dbw, iz> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
