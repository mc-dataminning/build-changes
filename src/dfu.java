import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dfu extends dga, dgm, dgo {
   @Override
   default <T extends dua> Optional<T> a(ji $$0, duc<T> $$1) {
      return dgm.super.a($$0, $$1);
   }

   @Override
   default List<fbv> c(@Nullable bum $$0, faw $$1) {
      return dga.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bum $$0, fbv $$1) {
      return dga.super.a($$0, $$1);
   }

   @Override
   default ji a(ect.a $$0, ji $$1) {
      return dgm.super.a($$0, $$1);
   }
}
