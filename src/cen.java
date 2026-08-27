import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cen {
   cen a = new cen() {
      @Override
      public <T> Optional<T> a(BiFunction<cpk, gv, T> $$0) {
         return Optional.empty();
      }
   };

   static cen a(final cpk $$0, final gv $$1) {
      return new cen() {
         @Override
         public <T> Optional<T> a(BiFunction<cpk, gv, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cpk, gv, T> var1);

   default <T> T a(BiFunction<cpk, gv, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cpk, gv> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
