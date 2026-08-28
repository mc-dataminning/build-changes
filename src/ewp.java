import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface ewp {
   ewp b = ($$0, $$1) -> false;
   ewp c = ($$0, $$1) -> true;

   boolean expand(ewh var1, Consumer<eww> var2);

   default ewp and(ewp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default ewp or(ewp $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
