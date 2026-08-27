import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface edb {
   edb b = ($$0, $$1) -> false;
   edb c = ($$0, $$1) -> true;

   boolean expand(ecq var1, Consumer<edi> var2);

   default edb and(edb $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default edb or(edb $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
