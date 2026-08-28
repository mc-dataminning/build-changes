import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eqo {
   eqo b = ($$0, $$1) -> false;
   eqo c = ($$0, $$1) -> true;

   boolean expand(eqg var1, Consumer<eqv> var2);

   default eqo and(eqo $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eqo or(eqo $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
