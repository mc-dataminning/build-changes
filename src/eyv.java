import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eyv {
   eyv b = ($$0, $$1) -> false;
   eyv c = ($$0, $$1) -> true;

   boolean expand(eyn var1, Consumer<ezc> var2);

   default eyv and(eyv $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eyv or(eyv $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
