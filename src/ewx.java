import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ewx {
   ewx b = ($$0, $$1) -> false;
   ewx c = ($$0, $$1) -> true;

   boolean expand(ewp var1, Consumer<exe> var2);

   default ewx and(ewx $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ewx or(ewx $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
