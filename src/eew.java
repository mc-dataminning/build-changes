import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eew {
   eew b = ($$0, $$1) -> false;
   eew c = ($$0, $$1) -> true;

   boolean expand(eel var1, Consumer<efd> var2);

   default eew and(eew $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eew or(eew $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
