import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ehh {
   ehh b = ($$0, $$1) -> false;
   ehh c = ($$0, $$1) -> true;

   boolean expand(egw var1, Consumer<eho> var2);

   default ehh and(ehh $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ehh or(ehh $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
