import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface efi {
   efi b = ($$0, $$1) -> false;
   efi c = ($$0, $$1) -> true;

   boolean expand(eex var1, Consumer<efp> var2);

   default efi and(efi $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default efi or(efi $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
