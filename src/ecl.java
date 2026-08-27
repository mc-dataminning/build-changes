import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ecl {
   @Nullable
   <T> T getElement(ecj<T> var1);

   @Nullable
   default <T> T getElement(ecm<T> $$0, aer $$1) {
      return this.getElement(new ecj<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(ecj<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ecm<T> $$0, aer $$1) {
      return this.getElementOptional(new ecj<>($$0, $$1));
   }

   default ecp getLootTable(aer $$0) {
      return this.getElementOptional(ecm.c, $$0).orElse(ecp.a);
   }
}
