import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ext {
   ext b = ($$0, $$1) -> false;
   ext c = ($$0, $$1) -> true;

   boolean expand(exl var1, Consumer<eya> var2);

   default ext and(ext $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ext or(ext $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
