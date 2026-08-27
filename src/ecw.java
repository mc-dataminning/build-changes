import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ecw {
   ecw b = ($$0, $$1) -> false;
   ecw c = ($$0, $$1) -> true;

   boolean expand(ecl var1, Consumer<edd> var2);

   default ecw and(ecw $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ecw or(ecw $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
