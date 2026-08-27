import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface clz {
   clz a = new clz() {
      @Override
      public <T> Optional<T> a(BiFunction<cwz, ib, T> $$0) {
         return Optional.empty();
      }
   };

   static clz a(final cwz $$0, final ib $$1) {
      return new clz() {
         @Override
         public <T> Optional<T> a(BiFunction<cwz, ib, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<cwz, ib, T> var1);

   default <T> T a(BiFunction<cwz, ib, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<cwz, ib> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
