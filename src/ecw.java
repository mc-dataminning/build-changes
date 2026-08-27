import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ecw {
   @Nullable
   <T> T getElement(ecu<T> var1);

   @Nullable
   default <T> T getElement(ecx<T> $$0, aey $$1) {
      return this.getElement(new ecu<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(ecu<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(ecx<T> $$0, aey $$1) {
      return this.getElementOptional(new ecu<>($$0, $$1));
   }

   default eda getLootTable(aey $$0) {
      return this.getElementOptional(ecx.c, $$0).orElse(eda.a);
   }
}
