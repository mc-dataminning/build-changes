import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface eha {
   @Nullable
   <T> T getElement(egy<T> var1);

   @Nullable
   default <T> T getElement(ehb<T> $$0, ahg $$1) {
      return this.getElement(new egy<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(egy<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ehb<T> $$0, ahg $$1) {
      return this.getElementOptional(new egy<>($$0, $$1));
   }

   default ehe getLootTable(ahg $$0) {
      return this.getElementOptional(ehb.c, $$0).orElse(ehe.a);
   }
}
