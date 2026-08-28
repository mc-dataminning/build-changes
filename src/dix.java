import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dix extends dje, djp, djr {
   @Override
   default <T extends dxr> Optional<T> a(iv $$0, dxt<T> $$1) {
      return djp.super.a($$0, $$1);
   }

   @Override
   default List<ffw> c(@Nullable bwi $$0, fex $$1) {
      return dje.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bwi $$0, ffw $$1) {
      return dje.super.a($$0, $$1);
   }

   @Override
   default iv a(egs.a $$0, iv $$1) {
      return djp.super.a($$0, $$1);
   }
}
