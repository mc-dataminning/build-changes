import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface eiz {
   @Nullable
   <T> T getElement(eix<T> var1);

   @Nullable
   default <T> T getElement(eja<T> $$0, aiy $$1) {
      return this.getElement(new eix<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(eix<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(eja<T> $$0, aiy $$1) {
      return this.getElementOptional(new eix<>($$0, $$1));
   }

   default ejd getLootTable(aiy $$0) {
      return this.getElementOptional(eja.c, $$0).orElse(ejd.a);
   }
}
