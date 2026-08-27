import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface daj extends dao, dba, dbc {
   @Override
   default <T extends dog> Optional<T> a(io $$0, doi<T> $$1) {
      return dba.super.a($$0, $$1);
   }

   @Override
   default List<evd> c(@Nullable bru $$0, euf $$1) {
      return dao.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bru $$0, evd $$1) {
      return dao.super.a($$0, $$1);
   }

   @Override
   default io a(dwt.a $$0, io $$1) {
      return dba.super.a($$0, $$1);
   }
}
