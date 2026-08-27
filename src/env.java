import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface env {
   env b = ($$0, $$1) -> false;
   env c = ($$0, $$1) -> true;

   boolean expand(enk var1, Consumer<eoc> var2);

   default env and(env $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default env or(env $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
