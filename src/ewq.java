import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ewq {
   ewq b = ($$0, $$1) -> false;
   ewq c = ($$0, $$1) -> true;

   boolean expand(ewi var1, Consumer<ewx> var2);

   default ewq and(ewq $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ewq or(ewq $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
