import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dci extends dcn, dcz, ddb {
   @Override
   default <T extends dqh> Optional<T> a(jd $$0, dqj<T> $$1) {
      return dcz.super.a($$0, $$1);
   }

   @Override
   default List<exv> c(@Nullable bsr $$0, ewx $$1) {
      return dcn.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsr $$0, exv $$1) {
      return dcn.super.a($$0, $$1);
   }

   @Override
   default jd a(dyy.a $$0, jd $$1) {
      return dcz.super.a($$0, $$1);
   }
}
