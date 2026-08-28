import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ezp {
   ezp b = ($$0, $$1) -> false;
   ezp c = ($$0, $$1) -> true;

   boolean expand(ezh var1, Consumer<ezw> var2);

   default ezp and(ezp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ezp or(ezp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
