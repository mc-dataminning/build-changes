import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface evz {
   evz b = ($$0, $$1) -> false;
   evz c = ($$0, $$1) -> true;

   boolean expand(evr var1, Consumer<ewg> var2);

   default evz and(evz $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default evz or(evz $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
