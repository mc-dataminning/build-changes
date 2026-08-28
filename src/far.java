import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface far {
   far b = ($$0, $$1) -> false;
   far c = ($$0, $$1) -> true;

   boolean expand(faj var1, Consumer<fay> var2);

   default far and(far $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default far or(far $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
