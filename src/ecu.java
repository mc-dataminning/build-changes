import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ecu {
   @Nullable
   <T> T getElement(ecs<T> var1);

   @Nullable
   default <T> T getElement(ecv<T> $$0, aex $$1) {
      return this.getElement(new ecs<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(ecs<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ecv<T> $$0, aex $$1) {
      return this.getElementOptional(new ecs<>($$0, $$1));
   }

   default ecy getLootTable(aex $$0) {
      return this.getElementOptional(ecv.c, $$0).orElse(ecy.a);
   }
}
