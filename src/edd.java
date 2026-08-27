import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface edd {
   edd b = ($$0, $$1) -> false;
   edd c = ($$0, $$1) -> true;

   boolean expand(ecs var1, Consumer<edk> var2);

   default edd and(edd $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default edd or(edd $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
