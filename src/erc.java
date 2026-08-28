import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface erc {
   erc b = ($$0, $$1) -> false;
   erc c = ($$0, $$1) -> true;

   boolean expand(equ var1, Consumer<erj> var2);

   default erc and(erc $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default erc or(erc $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
