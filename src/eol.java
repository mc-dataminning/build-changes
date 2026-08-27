import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eol {
   eol b = ($$0, $$1) -> false;
   eol c = ($$0, $$1) -> true;

   boolean expand(eoa var1, Consumer<eos> var2);

   default eol and(eol $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eol or(eol $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
