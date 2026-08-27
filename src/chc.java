import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface chc {
   chc a = new chc() {
      @Override
      public <T> Optional<T> a(BiFunction<csf, hx, T> $$0) {
         return Optional.empty();
      }
   };

   static chc a(final csf $$0, final hx $$1) {
      return new chc() {
         @Override
         public <T> Optional<T> a(BiFunction<csf, hx, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<csf, hx, T> var1);

   default <T> T a(BiFunction<csf, hx, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<csf, hx> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
