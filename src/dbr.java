import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dbr extends dbw, dci, dck {
   @Override
   default <T extends dpp> Optional<T> a(ja $$0, dpr<T> $$1) {
      return dci.super.a($$0, $$1);
   }

   @Override
   default List<ewy> c(@Nullable bsg $$0, ewa $$1) {
      return dbw.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bsg $$0, ewy $$1) {
      return dbw.super.a($$0, $$1);
   }

   @Override
   default ja a(dyf.a $$0, ja $$1) {
      return dci.super.a($$0, $$1);
   }
}
