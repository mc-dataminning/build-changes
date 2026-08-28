import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface csb {
   csb a = new csb() {
      @Override
      public <T> Optional<T> a(BiFunction<dfb, jh, T> $$0) {
         return Optional.empty();
      }
   };

   static csb a(final dfb $$0, final jh $$1) {
      return new csb() {
         @Override
         public <T> Optional<T> a(BiFunction<dfb, jh, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dfb, jh, T> var1);

   default <T> T a(BiFunction<dfb, jh, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dfb, jh> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
