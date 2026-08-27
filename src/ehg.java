import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ehg {
   ehg b = ($$0, $$1) -> false;
   ehg c = ($$0, $$1) -> true;

   boolean expand(egv var1, Consumer<ehn> var2);

   default ehg and(ehg $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ehg or(ehg $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
