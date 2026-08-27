import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ejn {
   ejn b = ($$0, $$1) -> false;
   ejn c = ($$0, $$1) -> true;

   boolean expand(ejc var1, Consumer<eju> var2);

   default ejn and(ejn $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ejn or(ejn $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
