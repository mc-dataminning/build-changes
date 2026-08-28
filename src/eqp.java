import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eqp {
   eqp b = ($$0, $$1) -> false;
   eqp c = ($$0, $$1) -> true;

   boolean expand(eqh var1, Consumer<eqw> var2);

   default eqp and(eqp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eqp or(eqp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
