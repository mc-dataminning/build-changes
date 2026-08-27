import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface eky {
   @Nullable
   <T> T getElement(ekw<T> var1);

   @Nullable
   default <T> T getElement(ekz<T> $$0, ajh $$1) {
      return this.getElement(new ekw<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(ekw<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ekz<T> $$0, ajh $$1) {
      return this.getElementOptional(new ekw<>($$0, $$1));
   }

   default elc getLootTable(ajh $$0) {
      return this.getElementOptional(ekz.c, $$0).orElse(elc.a);
   }
}
