import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cqg {
   cqg a = new cqg() {
      @Override
      public <T> Optional<T> a(BiFunction<dcw, jd, T> $$0) {
         return Optional.empty();
      }
   };

   static cqg a(final dcw $$0, final jd $$1) {
      return new cqg() {
         @Override
         public <T> Optional<T> a(BiFunction<dcw, jd, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dcw, jd, T> var1);

   default <T> T a(BiFunction<dcw, jd, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dcw, jd> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
