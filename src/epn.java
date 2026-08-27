import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface epn {
   epn b = ($$0, $$1) -> false;
   epn c = ($$0, $$1) -> true;

   boolean expand(epf var1, Consumer<epu> var2);

   default epn and(epn $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default epn or(epn $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
