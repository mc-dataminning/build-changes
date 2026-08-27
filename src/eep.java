import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface eep {
   @Nullable
   <T> T getElement(een<T> var1);

   @Nullable
   default <T> T getElement(eeq<T> $$0, agg $$1) {
      return this.getElement(new een<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(een<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(eeq<T> $$0, agg $$1) {
      return this.getElementOptional(new een<>($$0, $$1));
   }

   default eet getLootTable(agg $$0) {
      return this.getElementOptional(eeq.c, $$0).orElse(eet.a);
   }
}
