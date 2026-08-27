import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface egi {
   @Nullable
   <T> T getElement(egg<T> var1);

   @Nullable
   default <T> T getElement(egj<T> $$0, agt $$1) {
      return this.getElement(new egg<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(egg<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(egj<T> $$0, agt $$1) {
      return this.getElementOptional(new egg<>($$0, $$1));
   }

   default egm getLootTable(agt $$0) {
      return this.getElementOptional(egj.c, $$0).orElse(egm.a);
   }
}
