import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface efn {
   efn b = ($$0, $$1) -> false;
   efn c = ($$0, $$1) -> true;

   boolean expand(efc var1, Consumer<efu> var2);

   default efn and(efn $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default efn or(efn $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
