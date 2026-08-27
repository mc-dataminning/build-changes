import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ecr {
   ecr b = ($$0, $$1) -> false;
   ecr c = ($$0, $$1) -> true;

   boolean expand(ecg var1, Consumer<ecy> var2);

   default ecr and(ecr $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ecr or(ecr $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
