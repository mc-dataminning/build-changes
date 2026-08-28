import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ddu extends dea, dem, deo {
   @Override
   default <T extends drv> Optional<T> a(jf $$0, drx<T> $$1) {
      return dem.super.a($$0, $$1);
   }

   @Override
   default List<ezq> c(@Nullable btr $$0, eyr $$1) {
      return dea.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable btr $$0, ezq $$1) {
      return dea.super.a($$0, $$1);
   }

   @Override
   default jf a(eao.a $$0, jf $$1) {
      return dem.super.a($$0, $$1);
   }
}
