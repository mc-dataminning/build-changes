import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cqe {
   cqe a = new cqe() {
      @Override
      public <T> Optional<T> a(BiFunction<dcu, jd, T> $$0) {
         return Optional.empty();
      }
   };

   static cqe a(final dcu $$0, final jd $$1) {
      return new cqe() {
         @Override
         public <T> Optional<T> a(BiFunction<dcu, jd, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dcu, jd, T> var1);

   default <T> T a(BiFunction<dcu, jd, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dcu, jd> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
