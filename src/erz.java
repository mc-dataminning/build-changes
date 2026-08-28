import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface erz {
   erz b = ($$0, $$1) -> false;
   erz c = ($$0, $$1) -> true;

   boolean expand(err var1, Consumer<esg> var2);

   default erz and(erz $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default erz or(erz $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
