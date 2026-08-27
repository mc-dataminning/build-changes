import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface eoe {
   @Nullable
   <T> T getElement(eoc<T> var1);

   @Nullable
   default <T> T getElement(eof<T> $$0, akf $$1) {
      return this.getElement(new eoc<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(eoc<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(eof<T> $$0, akf $$1) {
      return this.getElementOptional(new eoc<>($$0, $$1));
   }

   default eoi getLootTable(akf $$0) {
      return this.getElementOptional(eof.c, $$0).orElse(eoi.a);
   }
}
