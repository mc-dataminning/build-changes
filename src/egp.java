import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface egp {
   egp b = ($$0, $$1) -> false;
   egp c = ($$0, $$1) -> true;

   boolean expand(ege var1, Consumer<egw> var2);

   default egp and(egp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default egp or(egp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
