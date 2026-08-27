import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface elf {
   elf b = ($$0, $$1) -> false;
   elf c = ($$0, $$1) -> true;

   boolean expand(eku var1, Consumer<elm> var2);

   default elf and(elf $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default elf or(elf $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
