import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ecp {
   @Nullable
   <T> T getElement(ecn<T> var1);

   @Nullable
   default <T> T getElement(ecq<T> $$0, aeu $$1) {
      return this.getElement(new ecn<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(ecn<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ecq<T> $$0, aeu $$1) {
      return this.getElementOptional(new ecn<>($$0, $$1));
   }

   default ect getLootTable(aeu $$0) {
      return this.getElementOptional(ecq.c, $$0).orElse(ect.a);
   }
}
