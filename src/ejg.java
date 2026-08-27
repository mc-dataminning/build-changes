import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ejg {
   ejg b = ($$0, $$1) -> false;
   ejg c = ($$0, $$1) -> true;

   boolean expand(eiv var1, Consumer<ejn> var2);

   default ejg and(ejg $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ejg or(ejg $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
