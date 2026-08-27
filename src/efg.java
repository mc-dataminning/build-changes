import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface efg {
   @Nullable
   <T> T getElement(efe<T> var1);

   @Nullable
   default <T> T getElement(efh<T> $$0, agm $$1) {
      return this.getElement(new efe<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(efe<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(efh<T> $$0, agm $$1) {
      return this.getElementOptional(new efe<>($$0, $$1));
   }

   default efk getLootTable(agm $$0) {
      return this.getElementOptional(efh.c, $$0).orElse(efk.a);
   }
}
