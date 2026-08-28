import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dgt extends dgz, dhl, dhn {
   @Override
   default <T extends dux> Optional<T> a(jh $$0, duz<T> $$1) {
      return dhl.super.a($$0, $$1);
   }

   @Override
   default List<fcs> c(@Nullable bvk $$0, fbt $$1) {
      return dgz.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bvk $$0, fcs $$1) {
      return dgz.super.a($$0, $$1);
   }

   @Override
   default jh a(edq.a $$0, jh $$1) {
      return dhl.super.a($$0, $$1);
   }
}
