import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbm extends dbr, dcd, dcf {
   @Override
   default <T extends dpj> Optional<T> a(iz $$0, dpl<T> $$1) {
      return dcd.super.a($$0, $$1);
   }

   @Override
   default List<ewm> c(@Nullable bsw $$0, evo $$1) {
      return dbr.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsw $$0, ewm $$1) {
      return dbr.super.a($$0, $$1);
   }

   @Override
   default iz a(dxw.a $$0, iz $$1) {
      return dcd.super.a($$0, $$1);
   }
}
