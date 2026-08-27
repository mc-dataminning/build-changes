import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface eno {
   @Nullable
   <T> T getElement(enm<T> var1);

   @Nullable
   default <T> T getElement(enp<T> $$0, ajv $$1) {
      return this.getElement(new enm<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(enm<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(enp<T> $$0, ajv $$1) {
      return this.getElementOptional(new enm<>($$0, $$1));
   }

   default ens getLootTable(ajv $$0) {
      return this.getElementOptional(enp.c, $$0).orElse(ens.a);
   }
}
