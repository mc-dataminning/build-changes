import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface crd {
   crd a = new crd() {
      @Override
      public <T> Optional<T> a(BiFunction<dds, je, T> $$0) {
         return Optional.empty();
      }
   };

   static crd a(final dds $$0, final je $$1) {
      return new crd() {
         @Override
         public <T> Optional<T> a(BiFunction<dds, je, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dds, je, T> var1);

   default <T> T a(BiFunction<dds, je, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dds, je> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
