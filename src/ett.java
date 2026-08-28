import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ett {
   ett b = ($$0, $$1) -> false;
   ett c = ($$0, $$1) -> true;

   boolean expand(etl var1, Consumer<eua> var2);

   default ett and(ett $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ett or(ett $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
