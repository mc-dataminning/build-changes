import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface fap {
   fap b = ($$0, $$1) -> false;
   fap c = ($$0, $$1) -> true;

   boolean expand(fah var1, Consumer<faw> var2);

   default fap and(fap $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default fap or(fap $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
