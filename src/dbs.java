import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbs extends dbx, dcj, dcl {
   @Override
   default <T extends dpq> Optional<T> a(ja $$0, dps<T> $$1) {
      return dcj.super.a($$0, $$1);
   }

   @Override
   default List<exa> c(@Nullable bsh $$0, ewc $$1) {
      return dbx.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsh $$0, exa $$1) {
      return dbx.super.a($$0, $$1);
   }

   @Override
   default ja a(dyg.a $$0, ja $$1) {
      return dcj.super.a($$0, $$1);
   }
}
