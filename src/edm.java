import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface edm {
   @Nullable
   <T> T getElement(edk<T> var1);

   @Nullable
   default <T> T getElement(edn<T> $$0, afw $$1) {
      return this.getElement(new edk<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(edk<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(edn<T> $$0, afw $$1) {
      return this.getElementOptional(new edk<>($$0, $$1));
   }

   default edq getLootTable(afw $$0) {
      return this.getElementOptional(edn.c, $$0).orElse(edq.a);
   }
}
