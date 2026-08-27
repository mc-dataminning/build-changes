import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ecu {
   ecu a = ($$0, $$1) -> false;
   ecu b = ($$0, $$1) -> true;

   boolean expand(ech var1, Consumer<edb> var2);

   default ecu and(ecu $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ecu or(ecu $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
