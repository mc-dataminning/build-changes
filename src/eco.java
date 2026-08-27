import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface eco {
   @Nullable
   <T> T getElement(ecm<T> var1);

   @Nullable
   default <T> T getElement(ecp<T> $$0, aez $$1) {
      return this.getElement(new ecm<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(ecm<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ecp<T> $$0, aez $$1) {
      return this.getElementOptional(new ecm<>($$0, $$1));
   }

   default ecs getLootTable(aez $$0) {
      return this.getElementOptional(ecp.c, $$0).orElse(ecs.a);
   }
}
