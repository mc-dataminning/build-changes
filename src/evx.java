import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface evx {
   evx b = ($$0, $$1) -> false;
   evx c = ($$0, $$1) -> true;

   boolean expand(evp var1, Consumer<ewe> var2);

   default evx and(evx $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default evx or(evx $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
