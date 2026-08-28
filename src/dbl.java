import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbl extends dbq, dcc, dce {
   @Override
   default <T extends dpi> Optional<T> a(iz $$0, dpk<T> $$1) {
      return dcc.super.a($$0, $$1);
   }

   @Override
   default List<ewl> c(@Nullable bsv $$0, evn $$1) {
      return dbq.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsv $$0, ewl $$1) {
      return dbq.super.a($$0, $$1);
   }

   @Override
   default iz a(dxv.a $$0, iz $$1) {
      return dcc.super.a($$0, $$1);
   }
}
