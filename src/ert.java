import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ert {
   ert b = ($$0, $$1) -> false;
   ert c = ($$0, $$1) -> true;

   boolean expand(erl var1, Consumer<esa> var2);

   default ert and(ert $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ert or(ert $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
