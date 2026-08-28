import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface eue {
   eue b = ($$0, $$1) -> false;
   eue c = ($$0, $$1) -> true;

   boolean expand(etw var1, Consumer<eul> var2);

   default eue and(eue $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default eue or(eue $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
