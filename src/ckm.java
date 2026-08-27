import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface ckm {
   ckm a = new ckm() {
      @Override
      public <T> Optional<T> a(BiFunction<cvn, hz, T> $$0) {
         return Optional.empty();
      }
   };

   static ckm a(final cvn $$0, final hz $$1) {
      return new ckm() {
         @Override
         public <T> Optional<T> a(BiFunction<cvn, hz, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cvn, hz, T> var1);

   default <T> T a(BiFunction<cvn, hz, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cvn, hz> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
