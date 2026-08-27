import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface edt {
   edt b = ($$0, $$1) -> false;
   edt c = ($$0, $$1) -> true;

   boolean expand(edi var1, Consumer<eea> var2);

   default edt and(edt $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default edt or(edt $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
