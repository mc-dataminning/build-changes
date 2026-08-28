import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ddd extends ddj, ddv, ddx {
   @Override
   default <T extends dre> Optional<T> a(je $$0, drg<T> $$1) {
      return ddv.super.a($$0, $$1);
   }

   @Override
   default List<eyx> c(@Nullable btj $$0, exz $$1) {
      return ddj.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable btj $$0, eyx $$1) {
      return ddj.super.a($$0, $$1);
   }

   @Override
   default je a(dzw.a $$0, je $$1) {
      return ddv.super.a($$0, $$1);
   }
}
