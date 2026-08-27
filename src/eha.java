import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eha {
   eha b = ($$0, $$1) -> false;
   eha c = ($$0, $$1) -> true;

   boolean expand(egp var1, Consumer<ehh> var2);

   default eha and(eha $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eha or(eha $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
