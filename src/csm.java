import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface csm {
   csm a = new csm() {
      @Override
      public <T> Optional<T> a(BiFunction<dfm, jh, T> $$0) {
         return Optional.empty();
      }
   };

   static csm a(final dfm $$0, final jh $$1) {
      return new csm() {
         @Override
         public <T> Optional<T> a(BiFunction<dfm, jh, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dfm, jh, T> var1);

   default <T> T a(BiFunction<dfm, jh, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dfm, jh> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
