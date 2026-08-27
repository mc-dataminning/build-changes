import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ejg {
   @Nullable
   <T> T getElement(eje<T> var1);

   @Nullable
   default <T> T getElement(ejh<T> $$0, aiy $$1) {
      return this.getElement(new eje<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(eje<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ejh<T> $$0, aiy $$1) {
      return this.getElementOptional(new eje<>($$0, $$1));
   }

   default ejk getLootTable(aiy $$0) {
      return this.getElementOptional(ejh.c, $$0).orElse(ejk.a);
   }
}
