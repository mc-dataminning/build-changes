import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dci extends dcn, dcz, ddb {
   @Override
   default <T extends dqh> Optional<T> a(jd $$0, dqj<T> $$1) {
      return dcz.super.a($$0, $$1);
   }

   @Override
   default List<ext> c(@Nullable bsr $$0, ewv $$1) {
      return dcn.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsr $$0, ext $$1) {
      return dcn.super.a($$0, $$1);
   }

   @Override
   default jd a(dyy.a $$0, jd $$1) {
      return dcz.super.a($$0, $$1);
   }
}
