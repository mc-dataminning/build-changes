import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface dzo {
   @Nullable
   <T> T getElement(dzm<T> var1);

   @Nullable
   default <T> T getElement(dzp<T> $$0, acq $$1) {
      return this.getElement(new dzm<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(dzm<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(dzp<T> $$0, acq $$1) {
      return this.getElementOptional(new dzm<>($$0, $$1));
   }

   default dzs getLootTable(acq $$0) {
      return this.getElementOptional(dzp.c, $$0).orElse(dzs.a);
   }
}
