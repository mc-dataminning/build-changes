import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cfc {
   cfc a = new cfc() {
      @Override
      public <T> Optional<T> a(BiFunction<cqb, gw, T> $$0) {
         return Optional.empty();
      }
   };

   static cfc a(final cqb $$0, final gw $$1) {
      return new cfc() {
         @Override
         public <T> Optional<T> a(BiFunction<cqb, gw, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cqb, gw, T> var1);

   default <T> T a(BiFunction<cqb, gw, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cqb, gw> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
