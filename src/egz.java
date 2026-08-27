import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface egz {
   @Nullable
   <T> T getElement(egx<T> var1);

   @Nullable
   default <T> T getElement(eha<T> $$0, ahg $$1) {
      return this.getElement(new egx<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(egx<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(eha<T> $$0, ahg $$1) {
      return this.getElementOptional(new egx<>($$0, $$1));
   }

   default ehd getLootTable(ahg $$0) {
      return this.getElementOptional(eha.c, $$0).orElse(ehd.a);
   }
}
