import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface euo {
   euo b = ($$0, $$1) -> false;
   euo c = ($$0, $$1) -> true;

   boolean expand(eug var1, Consumer<euv> var2);

   default euo and(euo $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default euo or(euo $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
