import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface fab {
   fab b = ($$0, $$1) -> false;
   fab c = ($$0, $$1) -> true;

   boolean expand(ezt var1, Consumer<fai> var2);

   default fab and(fab $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default fab or(fab $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
