import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cua {
   cua a = new cua() {
      @Override
      public <T> Optional<T> a(BiFunction<dhp, jj, T> $$0) {
         return Optional.empty();
      }
   };

   static cua a(final dhp $$0, final jj $$1) {
      return new cua() {
         @Override
         public <T> Optional<T> a(BiFunction<dhp, jj, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dhp, jj, T> var1);

   default <T> T a(BiFunction<dhp, jj, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dhp, jj> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
