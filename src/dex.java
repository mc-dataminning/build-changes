import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dex extends dfd, dfp, dfr {
   @Override
   default <T extends dsy> Optional<T> a(jh $$0, dta<T> $$1) {
      return dfp.super.a($$0, $$1);
   }

   @Override
   default List<fas> c(@Nullable bul $$0, ezt $$1) {
      return dfd.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bul $$0, fas $$1) {
      return dfd.super.a($$0, $$1);
   }

   @Override
   default jh a(ebq.a $$0, jh $$1) {
      return dfp.super.a($$0, $$1);
   }
}
