import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface fbb {
   fbb b = ($$0, $$1) -> false;
   fbb c = ($$0, $$1) -> true;

   boolean expand(fat var1, Consumer<fbi> var2);

   default fbb and(fbb $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default fbb or(fbb $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
