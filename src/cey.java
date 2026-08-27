import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cey {
   cey a = new cey() {
      @Override
      public <T> Optional<T> a(BiFunction<cpx, gw, T> $$0) {
         return Optional.empty();
      }
   };

   static cey a(final cpx $$0, final gw $$1) {
      return new cey() {
         @Override
         public <T> Optional<T> a(BiFunction<cpx, gw, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cpx, gw, T> var1);

   default <T> T a(BiFunction<cpx, gw, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cpx, gw> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
