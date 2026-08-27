import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ecs {
   ecs b = ($$0, $$1) -> false;
   ecs c = ($$0, $$1) -> true;

   boolean expand(ech var1, Consumer<ecz> var2);

   default ecs and(ecs $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ecs or(ecs $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
