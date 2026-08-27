import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface erx {
   erx b = ($$0, $$1) -> false;
   erx c = ($$0, $$1) -> true;

   boolean expand(erp var1, Consumer<ese> var2);

   default erx and(erx $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default erx or(erx $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
