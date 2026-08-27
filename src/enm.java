import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface enm {
   enm b = ($$0, $$1) -> false;
   enm c = ($$0, $$1) -> true;

   boolean expand(enb var1, Consumer<ent> var2);

   default enm and(enm $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default enm or(enm $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
