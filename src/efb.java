import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface efb {
   @Nullable
   <T> T getElement(eez<T> var1);

   @Nullable
   default <T> T getElement(efc<T> $$0, agi $$1) {
      return this.getElement(new eez<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(eez<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(efc<T> $$0, agi $$1) {
      return this.getElementOptional(new eez<>($$0, $$1));
   }

   default eff getLootTable(agi $$0) {
      return this.getElementOptional(efc.c, $$0).orElse(eff.a);
   }
}
