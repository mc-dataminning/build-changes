import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface enf {
   @Nullable
   <T> T getElement(end<T> var1);

   @Nullable
   default <T> T getElement(eng<T> $$0, ajt $$1) {
      return this.getElement(new end<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(end<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(eng<T> $$0, ajt $$1) {
      return this.getElementOptional(new end<>($$0, $$1));
   }

   default enj getLootTable(ajt $$0) {
      return this.getElementOptional(eng.c, $$0).orElse(enj.a);
   }
}
