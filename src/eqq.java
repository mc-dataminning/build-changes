import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eqq {
   eqq b = ($$0, $$1) -> false;
   eqq c = ($$0, $$1) -> true;

   boolean expand(eqi var1, Consumer<eqx> var2);

   default eqq and(eqq $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eqq or(eqq $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
