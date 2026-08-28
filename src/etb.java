import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface etb {
   etb b = ($$0, $$1) -> false;
   etb c = ($$0, $$1) -> true;

   boolean expand(est var1, Consumer<eti> var2);

   default etb and(etb $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default etb or(etb $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
