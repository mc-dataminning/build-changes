import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface euk {
   euk b = ($$0, $$1) -> false;
   euk c = ($$0, $$1) -> true;

   boolean expand(euc var1, Consumer<eur> var2);

   default euk and(euk $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default euk or(euk $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
