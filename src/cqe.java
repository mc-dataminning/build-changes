import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cqe {
   cqe a = new cqe() {
      @Override
      public <T> Optional<T> a(BiFunction<dbx, iz, T> $$0) {
         return Optional.empty();
      }
   };

   static cqe a(final dbx $$0, final iz $$1) {
      return new cqe() {
         @Override
         public <T> Optional<T> a(BiFunction<dbx, iz, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dbx, iz, T> var1);

   default <T> T a(BiFunction<dbx, iz, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dbx, iz> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
