import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface egt {
   @Nullable
   <T> T getElement(egr<T> var1);

   @Nullable
   default <T> T getElement(egu<T> $$0, ahd $$1) {
      return this.getElement(new egr<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(egr<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(egu<T> $$0, ahd $$1) {
      return this.getElementOptional(new egr<>($$0, $$1));
   }

   default egx getLootTable(ahd $$0) {
      return this.getElementOptional(egu.c, $$0).orElse(egx.a);
   }
}
