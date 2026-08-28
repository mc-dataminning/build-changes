import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eww {
   eww b = ($$0, $$1) -> false;
   eww c = ($$0, $$1) -> true;

   boolean expand(ewo var1, Consumer<exd> var2);

   default eww and(eww $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eww or(eww $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
