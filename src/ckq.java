import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface ckq {
   ckq a = new ckq() {
      @Override
      public <T> Optional<T> a(BiFunction<cvr, hz, T> $$0) {
         return Optional.empty();
      }
   };

   static ckq a(final cvr $$0, final hz $$1) {
      return new ckq() {
         @Override
         public <T> Optional<T> a(BiFunction<cvr, hz, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cvr, hz, T> var1);

   default <T> T a(BiFunction<cvr, hz, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cvr, hz> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
