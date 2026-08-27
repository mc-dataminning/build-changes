import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface dzx {
   dzx a = ($$0, $$1) -> false;
   dzx b = ($$0, $$1) -> true;

   boolean expand(dzk var1, Consumer<eae> var2);

   default dzx and(dzx $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default dzx or(dzx $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
