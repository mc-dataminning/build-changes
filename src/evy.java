import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface evy {
   evy b = ($$0, $$1) -> false;
   evy c = ($$0, $$1) -> true;

   boolean expand(evq var1, Consumer<ewf> var2);

   default evy and(evy $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default evy or(evy $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
