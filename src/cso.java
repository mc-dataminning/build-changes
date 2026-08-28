import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cso {
   cso a = new cso() {
      @Override
      public <T> Optional<T> a(BiFunction<dgh, ji, T> $$0) {
         return Optional.empty();
      }
   };

   static cso a(final dgh $$0, final ji $$1) {
      return new cso() {
         @Override
         public <T> Optional<T> a(BiFunction<dgh, ji, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dgh, ji, T> var1);

   default <T> T a(BiFunction<dgh, ji, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dgh, ji> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
