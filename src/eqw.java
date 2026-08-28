import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eqw {
   eqw b = ($$0, $$1) -> false;
   eqw c = ($$0, $$1) -> true;

   boolean expand(eqo var1, Consumer<erd> var2);

   default eqw and(eqw $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eqw or(eqw $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
