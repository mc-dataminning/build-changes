import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eqr {
   eqr b = ($$0, $$1) -> false;
   eqr c = ($$0, $$1) -> true;

   boolean expand(eqj var1, Consumer<eqy> var2);

   default eqr and(eqr $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eqr or(eqr $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
