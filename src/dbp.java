import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbp extends dbu, dcg, dci {
   @Override
   default <T extends dpn> Optional<T> a(ja $$0, dpp<T> $$1) {
      return dcg.super.a($$0, $$1);
   }

   @Override
   default List<ews> c(@Nullable bsd $$0, evu $$1) {
      return dbu.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsd $$0, ews $$1) {
      return dbu.super.a($$0, $$1);
   }

   @Override
   default ja a(dxz.a $$0, ja $$1) {
      return dcg.super.a($$0, $$1);
   }
}
