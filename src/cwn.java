import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cwn extends cws, cxe, cxg {
   @Override
   default <T extends dki> Optional<T> a(ib $$0, dkk<T> $$1) {
      return cxe.super.a($$0, $$1);
   }

   @Override
   default List<eqm> c(@Nullable box $$0, epo $$1) {
      return cws.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable box $$0, eqm $$1) {
      return cws.super.a($$0, $$1);
   }

   @Override
   default ib a(dso.a $$0, ib $$1) {
      return cxe.super.a($$0, $$1);
   }
}
