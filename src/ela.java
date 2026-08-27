import java.util.Optional;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ela {
   @Nullable
   <T> T getElement(eky<T> var1);

   @Nullable
   default <T> T getElement(elb<T> $$0, ajh $$1) {
      return this.getElement(new eky<>($$0, $$1));
   }

   default <T> Optional<T> getElementOptional(eky<T> $$0) {
      return Optional.ofNullable(this.getElement($$0));
   }

   default <T> Optional<T> getElementOptional(elb<T> $$0, ajh $$1) {
      return this.getElementOptional(new eky<>($$0, $$1));
   }

   default ele getLootTable(ajh $$0) {
      return this.getElementOptional(elb.c, $$0).orElse(ele.a);
   }
}
