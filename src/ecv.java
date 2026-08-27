import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ecv {
   ecv b = ($$0, $$1) -> false;
   ecv c = ($$0, $$1) -> true;

   boolean expand(eck var1, Consumer<edc> var2);

   default ecv and(ecv $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ecv or(ecv $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
