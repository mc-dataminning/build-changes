import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbi extends dbn, dbz, dcb {
   @Override
   default <T extends dpf> Optional<T> a(iz $$0, dph<T> $$1) {
      return dbz.super.a($$0, $$1);
   }

   @Override
   default List<ewi> c(@Nullable bss $$0, evk $$1) {
      return dbn.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bss $$0, ewi $$1) {
      return dbn.super.a($$0, $$1);
   }

   @Override
   default iz a(dxs.a $$0, iz $$1) {
      return dbz.super.a($$0, $$1);
   }
}
