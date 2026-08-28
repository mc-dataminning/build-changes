import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eql {
   eql b = ($$0, $$1) -> false;
   eql c = ($$0, $$1) -> true;

   boolean expand(eqd var1, Consumer<eqs> var2);

   default eql and(eql $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eql or(eql $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
