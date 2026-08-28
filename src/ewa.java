import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ewa {
   ewa b = ($$0, $$1) -> false;
   ewa c = ($$0, $$1) -> true;

   boolean expand(evs var1, Consumer<ewh> var2);

   default ewa and(ewa $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ewa or(ewa $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
