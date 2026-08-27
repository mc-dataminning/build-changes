import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ehq {
   ehq b = ($$0, $$1) -> false;
   ehq c = ($$0, $$1) -> true;

   boolean expand(ehf var1, Consumer<ehx> var2);

   default ehq and(ehq $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ehq or(ehq $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
