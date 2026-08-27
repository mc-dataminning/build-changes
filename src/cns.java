import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cns {
   cns a = new cns() {
      @Override
      public <T> Optional<T> a(BiFunction<czu, im, T> $$0) {
         return Optional.empty();
      }
   };

   static cns a(final czu $$0, final im $$1) {
      return new cns() {
         @Override
         public <T> Optional<T> a(BiFunction<czu, im, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<czu, im, T> var1);

   default <T> T a(BiFunction<czu, im, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<czu, im> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
