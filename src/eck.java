import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface eck {
   @Nullable
   <T> T getElement(eci<T> var1);

   @Nullable
   default <T> T getElement(ecl<T> $$0, aer $$1) {
      return this.getElement(new eci<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(eci<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ecl<T> $$0, aer $$1) {
      return this.getElementOptional(new eci<>($$0, $$1));
   }

   default eco getLootTable(aer $$0) {
      return this.getElementOptional(ecl.c, $$0).orElse(eco.a);
   }
}
