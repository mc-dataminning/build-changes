import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ere {
   ere b = ($$0, $$1) -> false;
   ere c = ($$0, $$1) -> true;

   boolean expand(eqw var1, Consumer<erl> var2);

   default ere and(ere $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ere or(ere $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
