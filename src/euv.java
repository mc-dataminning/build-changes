import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface euv {
   euv b = ($$0, $$1) -> false;
   euv c = ($$0, $$1) -> true;

   boolean expand(eun var1, Consumer<evc> var2);

   default euv and(euv $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default euv or(euv $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
