import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface crm {
   crm a = new crm() {
      @Override
      public <T> Optional<T> a(BiFunction<dej, jf, T> $$0) {
         return Optional.empty();
      }
   };

   static crm a(final dej $$0, final jf $$1) {
      return new crm() {
         @Override
         public <T> Optional<T> a(BiFunction<dej, jf, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dej, jf, T> var1);

   default <T> T a(BiFunction<dej, jf, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dej, jf> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
