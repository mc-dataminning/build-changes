import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface epp {
   epp b = ($$0, $$1) -> false;
   epp c = ($$0, $$1) -> true;

   boolean expand(eph var1, Consumer<epw> var2);

   default epp and(epp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default epp or(epp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
