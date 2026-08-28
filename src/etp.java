import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface etp {
   etp b = ($$0, $$1) -> false;
   etp c = ($$0, $$1) -> true;

   boolean expand(eth var1, Consumer<etw> var2);

   default etp and(etp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default etp or(etp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
