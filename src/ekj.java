import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ekj {
   ekj b = ($$0, $$1) -> false;
   ekj c = ($$0, $$1) -> true;

   boolean expand(ejy var1, Consumer<ekq> var2);

   default ekj and(ekj $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ekj or(ekj $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
