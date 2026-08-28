import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cvs {
   cvs a = new cvs() {
      @Override
      public <T> Optional<T> a(BiFunction<djm, iv, T> $$0) {
         return Optional.empty();
      }
   };

   static cvs a(final djm $$0, final iv $$1) {
      return new cvs() {
         @Override
         public <T> Optional<T> a(BiFunction<djm, iv, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<djm, iv, T> var1);

   default <T> T a(BiFunction<djm, iv, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<djm, iv> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
