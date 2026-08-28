import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ezh {
   ezh b = ($$0, $$1) -> false;
   ezh c = ($$0, $$1) -> true;

   boolean expand(eyz var1, Consumer<ezo> var2);

   default ezh and(ezh $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ezh or(ezh $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
