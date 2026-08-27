import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface czg extends czl, czx, czz {
   @Override
   default <T extends dnd> Optional<T> a(im $$0, dnf<T> $$1) {
      return czx.super.a($$0, $$1);
   }

   @Override
   default List<ety> c(@Nullable bql $$0, eta $$1) {
      return czl.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bql $$0, ety $$1) {
      return czl.super.a($$0, $$1);
   }

   @Override
   default im a(dvq.a $$0, im $$1) {
      return czx.super.a($$0, $$1);
   }
}
