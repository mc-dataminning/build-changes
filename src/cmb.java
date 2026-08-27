import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cmb {
   cmb a = new cmb() {
      @Override
      public <T> Optional<T> a(BiFunction<cxb, ib, T> $$0) {
         return Optional.empty();
      }
   };

   static cmb a(final cxb $$0, final ib $$1) {
      return new cmb() {
         @Override
         public <T> Optional<T> a(BiFunction<cxb, ib, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cxb, ib, T> var1);

   default <T> T a(BiFunction<cxb, ib, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cxb, ib> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
