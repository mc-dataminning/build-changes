import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface elh {
   elh b = ($$0, $$1) -> false;
   elh c = ($$0, $$1) -> true;

   boolean expand(ekw var1, Consumer<elo> var2);

   default elh and(elh $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default elh or(elh $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
