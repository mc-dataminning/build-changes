import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ekc {
   @Nullable
   <T> T getElement(eka<T> var1);

   @Nullable
   default <T> T getElement(ekd<T> $$0, ajc $$1) {
      return this.getElement(new eka<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(eka<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ekd<T> $$0, ajc $$1) {
      return this.getElementOptional(new eka<>($$0, $$1));
   }

   default ekg getLootTable(ajc $$0) {
      return this.getElementOptional(ekd.c, $$0).orElse(ekg.a);
   }
}
