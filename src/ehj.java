import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ehj {
   @Nullable
   <T> T getElement(ehh<T> var1);

   @Nullable
   default <T> T getElement(ehk<T> $$0, ahh $$1) {
      return this.getElement(new ehh<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(ehh<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ehk<T> $$0, ahh $$1) {
      return this.getElementOptional(new ehh<>($$0, $$1));
   }

   default ehn getLootTable(ahh $$0) {
      return this.getElementOptional(ehk.c, $$0).orElse(ehn.a);
   }
}
