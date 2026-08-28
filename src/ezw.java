import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ezw {
   ezw b = ($$0, $$1) -> false;
   ezw c = ($$0, $$1) -> true;

   boolean expand(ezo var1, Consumer<fad> var2);

   default ezw and(ezw $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ezw or(ezw $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
