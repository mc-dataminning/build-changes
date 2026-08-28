import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eqs {
   eqs b = ($$0, $$1) -> false;
   eqs c = ($$0, $$1) -> true;

   boolean expand(eqk var1, Consumer<eqz> var2);

   default eqs and(eqs $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eqs or(eqs $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
