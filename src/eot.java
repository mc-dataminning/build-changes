import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eot {
   eot b = ($$0, $$1) -> false;
   eot c = ($$0, $$1) -> true;

   boolean expand(eol var1, Consumer<epa> var2);

   default eot and(eot $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eot or(eot $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
