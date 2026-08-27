import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cvq extends cvv, cwh, cwj {
   @Override
   default <T extends djl> Optional<T> a(ib $$0, djn<T> $$1) {
      return cwh.super.a($$0, $$1);
   }

   @Override
   default List<epo> c(@Nullable bof $$0, eoq $$1) {
      return cvv.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bof $$0, epo $$1) {
      return cvv.super.a($$0, $$1);
   }

   @Override
   default ib a(drq.a $$0, ib $$1) {
      return cwh.super.a($$0, $$1);
   }
}
