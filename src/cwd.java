import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cwd {
   cwd a = new cwd() {
      @Override
      public <T> Optional<T> a(BiFunction<djx, iv, T> $$0) {
         return Optional.empty();
      }
   };

   static cwd a(final djx $$0, final iv $$1) {
      return new cwd() {
         @Override
         public <T> Optional<T> a(BiFunction<djx, iv, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<djx, iv, T> var1);

   default <T> T a(BiFunction<djx, iv, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<djx, iv> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
