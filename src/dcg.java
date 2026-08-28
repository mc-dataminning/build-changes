import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dcg extends dcl, dcx, dcz {
   @Override
   default <T extends dqf> Optional<T> a(jd $$0, dqh<T> $$1) {
      return dcx.super.a($$0, $$1);
   }

   @Override
   default List<exp> c(@Nullable bsq $$0, ewr $$1) {
      return dcl.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsq $$0, exp $$1) {
      return dcl.super.a($$0, $$1);
   }

   @Override
   default jd a(dyv.a $$0, jd $$1) {
      return dcx.super.a($$0, $$1);
   }
}
